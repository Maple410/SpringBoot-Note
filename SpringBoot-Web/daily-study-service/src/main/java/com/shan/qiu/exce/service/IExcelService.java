package com.shan.qiu.exce.service;

import com.shan.qiu.excel.importor.vo.UserInfoImport;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author: wangshuo
 * @Date: 2020/12/11 11:19
 */
public interface IExcelService {

    void exportExcel(HttpServletResponse response) throws Exception;

    List<UserInfoImport> importExcel(MultipartFile file);

    List<List<String>> importExcelList(MultipartFile file);
}
