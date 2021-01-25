package com.shan.qiu.excel.exportor.vo;


import com.shan.qiu.excel.exportor.ExcelConfig;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wangshuo
 * @Date: 2020/10/20 16:57
 */
@Data
@Builder
public class UserInfoExport implements Serializable {

    @ExcelConfig(exportName = "姓名")
    private String name;

    @ExcelConfig(exportName = "年龄")
    private Integer Age;

    @ExcelConfig(exportName = "地址")
    private String address;
}
