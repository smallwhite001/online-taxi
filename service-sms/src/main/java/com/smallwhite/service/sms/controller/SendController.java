package com.smallwhite.service.sms.controller;

import com.smallwhite.onlinetaxi.common.dto.ResponseResult;
import com.smallwhite.onlinetaxi.common.dto.sms.SmsSendRequest;
import com.smallwhite.service.sms.service.AliService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/send")
@Slf4j
public class SendController {
    @Autowired
    private AliService aliService;

    @RequestMapping(value = "/alisms-template",method = RequestMethod.POST)
    public ResponseResult send(@RequestBody SmsSendRequest smsSendRequest){
        //输出收到的参数内容
        JSONObject param = JSONObject.fromObject(smsSendRequest);
        log.info("/send/alisms-template   request："+param.toString());
        aliService.sendSms(smsSendRequest);
        return  ResponseResult.success("");
    }
}
