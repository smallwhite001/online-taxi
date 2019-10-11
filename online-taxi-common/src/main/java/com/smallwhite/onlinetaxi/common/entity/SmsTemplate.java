package com.smallwhite.onlinetaxi.common.entity;
import lombok.Data;

import java.util.Date;
@Data
public class SmsTemplate {
    private Integer id;

    private String templateId;

    private String templateName;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Boolean templateType;
}
