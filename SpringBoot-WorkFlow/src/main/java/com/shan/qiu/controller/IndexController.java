package com.shan.qiu.controller;

import com.shan.qiu.common.domains.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangshuo
 * @Date: 2021/1/25 16:58
 */
@RestController
@RequestMapping("/api/workflow")
public class IndexController {

    @GetMapping("/demo")
    public AjaxResult index(@RequestParam String demo) {
        return new AjaxResult(demo).success();
    }

}
