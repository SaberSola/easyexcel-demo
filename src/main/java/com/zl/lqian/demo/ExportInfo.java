package com.zl.lqian.demo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @Author zl
 */
public class ExportInfo extends BaseRowModel {
    @ExcelProperty(value = "姓名" ,index = 0)
    private String name;

    @ExcelProperty(value = "年龄",index = 1)
    private String age;

    @ExcelProperty(value = "邮箱",index = 2)
    private String email;

    @ExcelProperty(value = "地址",index = 3)
    private String address;

    @ExcelProperty(value = "姓名" ,index = 0)
    private String name1;

    @ExcelProperty(value = "年龄",index = 1)
    private String age1;

    @ExcelProperty(value = "邮箱",index = 2)
    private String email1;

    @ExcelProperty(value = "地址",index = 3)
    private String address1;


    @ExcelProperty(value = "姓名" ,index = 0)
    private String name2;

    @ExcelProperty(value = "年龄",index = 1)
    private String age2;

    @ExcelProperty(value = "邮箱",index = 2)
    private String email2;

    @ExcelProperty(value = "地址",index = 3)
    private String address2;


    @ExcelProperty(value = "姓名" ,index = 0)
    private String name4;

    @ExcelProperty(value = "年龄",index = 1)
    private String age4;

    @ExcelProperty(value = "邮箱",index = 2)
    private String email4;

    @ExcelProperty(value = "地址",index = 3)
    private String address4;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getAge1() {
        return age1;
    }

    public void setAge1(String age1) {
        this.age1 = age1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getAge2() {
        return age2;
    }

    public void setAge2(String age2) {
        this.age2 = age2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getAge4() {
        return age4;
    }

    public void setAge4(String age4) {
        this.age4 = age4;
    }

    public String getEmail4() {
        return email4;
    }

    public void setEmail4(String email4) {
        this.email4 = email4;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }
}
