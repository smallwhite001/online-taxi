package com.smallwhite.service.sms.dao;

import com.smallwhite.onlinetaxi.common.entity.Sms;
import com.smallwhite.service.sms.mapper.SmsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsDao {
  @Autowired
  private SmsMapper smsMapper;

    public int insert(Sms sms) {

        return smsMapper.insert(sms);
    }
}
