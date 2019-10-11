package com.smallwhite.service.sms.mapper;

import com.smallwhite.onlinetaxi.common.entity.Sms;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SmsMapper {

    /**
     * 根据id删除短信记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入短信记录
     * @param record
     * @return
     */
    int insert(Sms record);

    /**
     * 插入短信记录
     * @param record
     * @return
     */
    int insertSelective(Sms record);

    /**
     * 根据id查询短信记录
     * @param id
     * @return
     */
    Sms selectByPrimaryKey(Integer id);

    /**
     * 更新短信记录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Sms record);

    /**
     * 更新短信记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(Sms record);}
