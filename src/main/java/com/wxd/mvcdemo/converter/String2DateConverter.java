package com.wxd.mvcdemo.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by TEACHER on 2018/1/23.
 */
public class String2DateConverter implements Converter<String, Date> {

    private SimpleDateFormat format;

    public String2DateConverter(String pattern) {
        this.format = new SimpleDateFormat(pattern);
    }

    @Override
    public Date convert(String source) {
        try {
            return format.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("时间格式不正确!", e);
        }
    }
}
