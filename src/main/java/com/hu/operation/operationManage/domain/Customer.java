package com.hu.operation.operationManage.domain;import com.baomidou.mybatisplus.annotations.TableId;import com.baomidou.mybatisplus.annotations.TableName;import java.io.Serializable;import java.util.Date;import lombok.Data;import org.springframework.format.annotation.DateTimeFormat;@TableName("customer_manage")@Datapublic class Customer implements Serializable {    private static final long serialVersionUID = 1L;    @TableId    private Integer customerId;    private String customerName;    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")    private Date createTime;    private String customerAddressP;    private String customerAddressC;    private String contact;    private String contactInformation;    private Integer responsiblePerson;    private Integer customerProperty;}