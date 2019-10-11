package com.smallwhite.service.sms.dao;

import com.smallwhite.onlinetaxi.common.entity.SmsTemplate;
import com.smallwhite.service.sms.mapper.SmsTemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsTemplateDao {
    @Autowired
    private SmsTemplateMapper smsTemplateMapper;

    public SmsTemplate getByTemplateId(String templateId) {
        return smsTemplateMapper.selectByTemplateId(templateId);
    }
}
