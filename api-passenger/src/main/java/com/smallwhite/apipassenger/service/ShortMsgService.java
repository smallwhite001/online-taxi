package com.smallwhite.apipassenger.service;

import com.smallwhite.onlinetaxi.common.dto.ResponseResult;

public interface ShortMsgService {
    ResponseResult send(String phoneNumber, String code);
}
