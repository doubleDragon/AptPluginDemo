package com.wsl.demo.aptdemo;

import com.wsl.annotation.api.MyAnnotation;

/**
 * Created by wushuanglong on 2017/2/25.
 */

@MyAnnotation
public class PersonBean {
    public String name;
    public String address;

    public PersonBean(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return StringUtil.createString(this);
    }
}
