package com.shan.qiu.test;

import java.net.URLDecoder;

/**
 * @Author: wangshuo
 * @Date: 2021/1/26 16:47
 */
public class TestAll {

    public static void main(String[] args) {
         String s = "%E9%A2%86%E5%AF%BC%E5%AE%A1%E6%89%B9";
        System.out.println(URLDecoder.decode(s));
    }
}
