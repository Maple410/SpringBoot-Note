package com.shan.qiu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: wangshuo
 * @Date: 2021/1/4 14:19
 */
@Data
@TableName("company")
public class Company {

    /**
     * id
     */
    private Integer id;

    /**
     * 地址
     */
    private String address;

    /**
     * 名称
     */
    private String name;

    /**
     * 分类
     */
    private String shareholder;

}
