package com.smallwhite.apipassenger.service.impl;

import com.smallwhite.apipassenger.service.ShortMsgService;
import com.smallwhite.onlinetaxi.common.dto.ResponseResult;
import com.smallwhite.onlinetaxi.common.dto.sms.SmsSendRequest;
import com.smallwhite.onlinetaxi.common.dto.sms.SmsTemplateDto;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ShortMsgServiceImpl implements ShortMsgService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseResult send(String phoneNumber, String code) {
        System.out.println("手机号码和验证码:" + phoneNumber + "," + code);
        String url = "";
        SmsSendRequest smsSendRequest = new SmsSendRequest();
        String[] phoneNumbers = new String[]{phoneNumber};
        smsSendRequest.setReceivers(phoneNumbers);
        List<SmsTemplateDto> data = new ArrayList<>();
        SmsTemplateDto dto = new SmsTemplateDto();
        HashMap<String, Object> templateMap = new HashMap<>();
        templateMap.put("code", code);
        dto.setTemplateMap(templateMap);
        data.add(dto);

        //ribbon调用
        ResponseEntity<ResponseResult> resultEntity = restTemplate.postForEntity(url, smsSendRequest, ResponseResult.class);
        ResponseResult result = resultEntity.getBody();
        //feign调用
//		ResponseResult result = smsClient.sendSms(smsSendRequest);
        smsSendRequest.setData(data);

        System.out.println("调用短信服务返回的结果"+ JSONObject.fromObject(result));
        return result;
    }
}
