package com.shan.qiu.config.api;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

/**
 * @Author: wangshuo
 * @Date: 2021/1/25 14:02
 */
public class JApiDemo {

    /**
     * 仓库地址：https://github.com/YeDaxia/JApiDocs
     * 中文文档：https://japidocs.agilestudio.cn/#/zh-cn/
     * 有些烂 还不行
     *
     * @param args
     */
    public static void main(String[] args) {

        DocsConfig config = new DocsConfig();
        config.setProjectPath("E:\\ws_study_project\\SpringBoot-Note\\SpringBoot-Web\\daily-study-web");
        config.setProjectName("daily-study-web");
        config.setApiVersion("V1.0");
        config.setDocsPath("E:\\api");
        config.setAutoGenerate(Boolean.TRUE);
        Docs.buildHtmlDocs(config);
    }
}
