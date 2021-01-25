package com.shan.qiu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shan.qiu.domains.AjaxResult;
import com.shan.qiu.entity.Company;
import com.shan.qiu.general.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wangshuo
 * @Date: 2021/1/25 13:47
 *
 */
@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    /**
     * 公司列表
     * @return
     */
    @GetMapping("/list")
    public AjaxResult listCompany() {
        return new AjaxResult(companyService.list(new QueryWrapper<>())).success();
    }

    /**
     *
     * @param company
     * @return
     */
    @PostMapping("/add")
    public AjaxResult addCompany(@RequestBody Company company) {
        companyService.save(company);
        return new AjaxResult().success();
    }
}
