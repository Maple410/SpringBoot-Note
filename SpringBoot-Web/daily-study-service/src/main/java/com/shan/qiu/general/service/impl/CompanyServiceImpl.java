package com.shan.qiu.general.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shan.qiu.entity.Company;
import com.shan.qiu.general.service.ICompanyService;
import com.shan.qiu.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

/**
 * @Author: wangshuo
 * @Date: 2021/1/25 13:45
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {
}
