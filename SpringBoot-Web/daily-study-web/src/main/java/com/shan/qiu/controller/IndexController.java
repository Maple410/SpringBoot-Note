package com.shan.qiu.controller;

import com.shan.qiu.domains.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangshuo
 * @Date: 2021/1/22 15:36
 */
@RestController
@RequestMapping("/api/index")
public class IndexController {


    @GetMapping("/demo")
    public AjaxResult index(@RequestParam String demo) {
        return new AjaxResult(demo).success();
    }
}
