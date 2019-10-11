package com.smallwhite.service.sms.service;

import com.smallwhite.onlinetaxi.common.dto.sms.SmsSendRequest;

public interface AliService {
    /**
     * 发送短信
     * @param request
     * @return
     */
    public int sendSms(SmsSendRequest request);
}
