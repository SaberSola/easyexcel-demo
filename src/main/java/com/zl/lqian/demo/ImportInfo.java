package com.zl.lqian.demo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

/**
 * @Author zl
 */
public class ImportInfo extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String name;

    @ExcelProperty(index = 1)
    private String age;

    @ExcelProperty(index = 2)
    private String email;

    @ExcelProperty(index = 3)
    private String name1;

    @ExcelProperty(index = 4)
    private String age1;

    @ExcelProperty(index = 5)
    private String email1;


    @ExcelProperty(index = 6)
    private String name2;

    @ExcelProperty(index = 7)
    private String age2;

    @ExcelProperty(index = 8)
    private String email2;


    @ExcelProperty(index = 9)
    private String name3;

    @ExcelProperty(index = 10)
    private String age3;

    @ExcelProperty(index = 11)
    private String email3;


    @ExcelProperty(index = 12)
    private String name4;

    @ExcelProperty(index = 13)
    private String age4;

    @ExcelProperty(index = 14)
    private String email4;




    /*
        作为 excel 的模型映射，需要 setter 方法
     */
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

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getAge3() {
        return age3;
    }

    public void setAge3(String age3) {
        this.age3 = age3;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
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
}
