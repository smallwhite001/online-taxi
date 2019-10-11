package com.smallwhite.onlinetaxi.common.entity;
import java.util.Date;

import lombok.Data;
@Data
public class Sms {
    private Integer id;

    private String phoneNumber;

    private String smsContent;

    private Date sendTime;

    private String operator;

    private Integer sendFlag;

    private Integer sendNumber;

    private Date createTime;

    private Date updateTime;
}
