package com.zl.lqian.demo;

import com.zl.lqian.excel.ExcelUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zl
 */
@RestController
public class ExcelController {
    /**
     * 读取 Excel（允许多个 sheet）
     */
    @RequestMapping(value = "readExcelWithSheets", method = RequestMethod.POST)
    public Object readExcelWithSheets(MultipartFile excel) {
        return ExcelUtil.readExcel(excel, new ImportInfo());
    }

    /**
     * 读取 Excel（指定某个 sheet）
     */
    @ApiOperation(value = "上传",notes = "上传")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header",dataType = "string",name = "token",value = "访问凭证",required = true),
    })
    @RequestMapping(value = "readExcel", method = RequestMethod.POST)
    public Object readExcel(MultipartFile excel,  @RequestParam(defaultValue = "1") Integer sheetNo,
                            @RequestParam(defaultValue = "1") Integer headLineNum) {
          Long start = System.currentTimeMillis();
         ExcelUtil.readExcel(excel, new ImportInfo(), sheetNo, headLineNum);
        System.out.println(System.currentTimeMillis()- start);
         return null;
    }

    /**
     * 导出 Excel（一个 sheet）
     */
    @RequestMapping(value = "writeExcel", method = RequestMethod.GET)
    public void writeExcel(HttpServletResponse response) throws IOException {
        List<ExportInfo> list = getList();
        String fileName = "一个 Excel 文件";
        String sheetName = "第一个 sheet";

        ExcelUtil.writeExcel(response, list, fileName, sheetName, new ExportInfo());
    }
    /**
     * 导出 Excel（多个 sheet）
     */
    @RequestMapping(value = "writeExcelWithSheets", method = RequestMethod.GET)
    public void writeExcelWithSheets(HttpServletResponse response) throws IOException {
        List<ExportInfo> list =null;// getList();
        String fileName = "一个 Excel 文件";
        String sheetName1 = "第一个 sheet";
        String sheetName2 = "第二个 sheet";
        String sheetName3 = "第三个 sheet";

        ExcelUtil.writeExcelWithSheets(response, list, fileName, sheetName1, new ExportInfo())
                .write(list, sheetName2, new ExportInfo())
                .write(list, sheetName3, new ExportInfo())
                .finish();
    }

    private List<ExportInfo> getList() {
        List<ExportInfo> list = new ArrayList<>();
        for (int i = 0 ; i < 2500; i ++) {
            ExportInfo model1 = new ExportInfo();
            model1.setName("zhanglei");
            model1.setAge("19");
            model1.setAddress("123456789");
            model1.setEmail("123456789@gmail.com");

            model1.setName1("zhanglei");
            model1.setAge1("19");
            model1.setAddress1("123456789");
            model1.setEmail1("123456789@gmail.com");

            model1.setName2("zhanglei");
            model1.setAge2("19");
            model1.setAddress2("123456789");
            model1.setEmail2("123456789@gmail.com");


            model1.setName4("zhanglei");
            model1.setAge4("19");
            model1.setAddress4("123456789");
            model1.setEmail4("123456789@gmail.com");

            list.add(model1);
            ExportInfo model2 = new ExportInfo();
            model2.setName("zhanglei");
            model2.setAge("19");
            model2.setAddress("123456789");
            model2.setEmail("123456789@gmail.com");

            model2.setName1("zhanglei");
            model2.setAge1("19");
            model2.setAddress1("123456789");
            model2.setEmail1("123456789@gmail.com");

            model2.setName2("zhanglei");
            model2.setAge2("19");
            model2.setAddress2("123456789");
            model2.setEmail2("123456789@gmail.com");


            model2.setName4("zhanglei");
            model2.setAge4("19");
            model2.setAddress4("123456789");
            model2.setEmail4("123456789@gmail.com");

            list.add(model2);
        }
        return list;
    }
}
