package com.hu.sysManagement.common.domain;import com.baomidou.mybatisplus.annotations.TableId;import com.baomidou.mybatisplus.annotations.TableName;import lombok.Data;import java.io.Serializable;@Data@TableName("platform")public class Platform        implements Serializable {    private static final long serialVersionUID = 1L;    @TableId    private Long platId;    private String platDes;    private Long menuId;    private String remark;    private String icon;}