package com.hu.sysManagement.common.domain;import com.baomidou.mybatisplus.annotations.TableId;import com.baomidou.mybatisplus.annotations.TableName;import lombok.Data;import java.io.Serializable;import java.math.BigDecimal;import java.util.Date;@Data@TableName("sys_dict")public class Dict implements Serializable {    private static final long serialVersionUID = 1L;    @TableId    private Long id;    private String name;    private String value;    private String type;    private String description;    private BigDecimal sort;    private Long parentId;    private Integer createBy;    private Date createDate;    private Long updateBy;    private Date updateDate;    private String remarks;    private String delFlag;}