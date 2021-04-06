## 框架简介

基于若依微服务脚手架修改 [RuoYi-Cloud] 
详见 https://gitee.com/y_project/RuoYi-Cloud


* 采用前后端分离微服务的开发模式

* 前端采用Vue、Element UI。

* 后端采用Spring Boot、Spring Cloud & Alibaba。

* 注册中心、配置中心选型Nacos，权限认证使用Redis。

* 流量控制框架选型Sentinel，分布式事务选型Seata。

* 数据库采用PostgreSQl

## 开发文档参考若依微服务

文档地址：http://doc.ruoyi.vip/ruoyi-cloud/


## 开发准备

* 开发使用的数据库,本地安装MySQL5.7和PostgreSQL11,并执行项目中sql脚本


* 本地启动Redis.默认端口6379.无密码


* 本地启动Nacos.默认端口8848.nacos作为配置中心和服务注册中心.
    0. 需下载Nacos1.4.1,下载地址:https://github.com/alibaba/nacos/releases/download/1.4.1/nacos-server-1.4.1.zip
    1. 因为此资源在github上,建议使用迅雷下载
    2. 下载解压后找到conf/application.properties文件,修改此文件.
        增加支持mysql数据源配置(目前只支持mysql).复制下面的代码块即可.
        ```
        spring.datasource.platform=mysql

        db.num=1
        db.url.0=jdbc:mysql://localhost:3306/dual-channel-config?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
        db.user=root
        db.password=root
        ```



## 内置功能

1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。


## 系统模块

~~~
com.luoran     
├── dual-channel-api                                         // 接口模块
│       └── dual-channel-api-system                          // 系统接口
├── dual-channel-auth                                        // 认证中心 [10013]
├── dual-channel-common                                      // 通用模块
│       └── dual-channel-common-core                         // 核心模块
│       └── dual-channel-common-datascope                    // 权限范围
│       └── dual-channel-common-datasource                   // 多数据源
│       └── dual-channel-common-log                          // 日志记录
│       └── dual-channel-common-redis                        // 缓存服务
│       └── dual-channel-common-security                     // 安全模块
│       └── dual-channel-common-swagger                      // 系统接口
├── dual-channel-gateway                                     // 网关模块 [10012]
├── dual-channel-modules                                     // 业务模块
│       └── dual-channel-system                              // 系统模块 [10014]
│       └── dual-channel-gen                                 // 代码生成 [10015]
│       └── dual-channel-file                                // 文件服务 [10016]
│       └── dual-channel-job                                 // 定时任务 [10017]
├── dual-channel-visual                                      // 图形化管理模块
│       └── dual-channel-visual-monitor                      // 监控中心 [10011]
├──pom.xml                                                   // 公共依赖
~~~

## 架构图

<img src="https://oscimg.oschina.net/oscnet/up-82e9722ecb846786405a904bafcf19f73f3.png"/>
