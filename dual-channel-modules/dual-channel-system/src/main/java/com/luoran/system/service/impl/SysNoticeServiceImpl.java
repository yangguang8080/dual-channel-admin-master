package com.luoran.system.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.luoran.common.core.utils.StringUtils;
import com.luoran.system.domain.dto.SysNoticeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luoran.system.domain.SysNotice;
import com.luoran.system.mapper.SysNoticeMapper;
import com.luoran.system.service.ISysNoticeService;

/**
 * 公告 服务层实现
 *
 * @author guohailong
 */
@Service
public class SysNoticeServiceImpl implements ISysNoticeService {
    @Autowired
    private SysNoticeMapper noticeMapper;

    /**
     * 查询公告信息
     *
     * @param noticeId 公告ID
     * @return 公告信息
     */
    @Override
    public SysNotice selectNoticeById(Long noticeId) {
        SysNoticeDTO dto = noticeMapper.selectNoticeById(noticeId);
        SysNotice notice = new SysNotice();
        BeanUtils.copyProperties(dto, notice);
        if (dto.getNoticeContents() != null) {
            notice.setNoticeContent(new String(dto.getNoticeContents()));
        }
        return notice;
    }

    /**
     * 查询公告列表
     *
     * @param notice 公告信息
     * @return 公告集合
     */
    @Override
    public List<SysNotice> selectNoticeList(SysNotice notice) {
        return noticeMapper.selectNoticeList(notice);
    }

    /**
     * 新增公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    @Override
    public int insertNotice(SysNotice notice) {
        SysNoticeDTO dto = new SysNoticeDTO();
        BeanUtils.copyProperties(notice, dto);
        try {
            if (StringUtils.isNotEmpty(notice.getNoticeContent())) {
                dto.setNoticeContents(notice.getNoticeContent().getBytes("UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return noticeMapper.insertNotice(dto);
    }

    /**
     * 修改公告
     *
     * @param notice 公告信息
     * @return 结果
     */
    @Override
    public int updateNotice(SysNotice notice) {
        return noticeMapper.updateNotice(notice);
    }

    /**
     * 删除公告对象
     *
     * @param noticeId 公告ID
     * @return 结果
     */
    @Override
    public int deleteNoticeById(Long noticeId) {
        return noticeMapper.deleteNoticeById(noticeId);
    }

    /**
     * 批量删除公告信息
     *
     * @param noticeIds 需要删除的公告ID
     * @return 结果
     */
    @Override
    public int deleteNoticeByIds(Long[] noticeIds) {
        return noticeMapper.deleteNoticeByIds(noticeIds);
    }
}
