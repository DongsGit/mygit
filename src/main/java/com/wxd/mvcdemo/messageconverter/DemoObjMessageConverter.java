package com.wxd.mvcdemo.messageconverter;

import com.alibaba.fastjson.JSON;
import com.wxd.mvcdemo.vo.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by TEACHER on 2018/1/24.
 */
public class DemoObjMessageConverter extends AbstractHttpMessageConverter<DemoObj> {


    /**
     * 指定媒体类型
     */
    public DemoObjMessageConverter() {
        //application/wbs17091;charset=utf-8
        super(new MediaType("application", "wbs17091", Charset.forName("utf-8")));
    }


    /**
     * 该消息转换支持的类型
     *
     * @param clazz
     * @return
     */
    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }


    /**
     * 解析参数
     * @param clazz
     * @param inputMessage
     * @return
     * @throws IOException
     * @throws HttpMessageNotReadableException
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        //1-admin
        String body = StreamUtils.copyToString(inputMessage.getBody(), Charset.defaultCharset());

        String[] arrays = body.split("-");


        return new DemoObj(Integer.parseInt(arrays[0]), arrays[1]);
    }


    /**
     * 重写返回值格式
     * @param demoObj
     * @param outputMessage
     * @throws IOException
     * @throws HttpMessageNotWritableException
     */
    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //hello:1=admin

//        String out = "hello:" + demoObj.getId() + "=" + demoObj.getName();


        String out = JSON.toJSONString(demoObj);

        outputMessage.getBody().write(out.getBytes());

    }
}


