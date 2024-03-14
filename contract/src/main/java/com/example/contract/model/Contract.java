package com.example.contract.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("contract")
public class Contract {
    @TableId(type = IdType.INPUT)
    private Integer id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "amount")
    private BigDecimal amount;
}
