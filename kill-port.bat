@echo off & setlocal EnableDelayedExpansion

set obj[0]=10011
set obj[1]=10012
set obj[2]=10013
set obj[3]=10014
set obj[4]=10015
set obj[5]=10016
set obj[6]=10017


set port=0
set pid=0

for /f "usebackq delims== tokens=1-2" %%a in (`set obj`) do (
    set port=%%b
    for /f "tokens=5" %%m in ('netstat -aon ^| findstr ":%%b"') do (
        set pid=%%m
    )
    if "!pid!"=="0" (
        echo port [!port!] is not used
    ) else (
        echo port [!port!] has been killed
        taskkill /f /pid !pid!
    )
    set pid=0
)

pause