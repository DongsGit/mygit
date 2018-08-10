package com.wxd.mvcdemo.interceptors;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Created by TEACHER on 2018/1/24.
 */
public class ControllerInterceptor implements HandlerInterceptor {


    private static final Logger LOGGER = Logger.getLogger(ControllerInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("utf-8");

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            Class<?> declaringClass = method.getDeclaringClass();
//            LOGGER.info(declaringClass.getName() + "--" + method.getName());
        }

        HttpSession session = request.getSession();
        Boolean user = (Boolean) session.getAttribute("admin");

        //根据用户名去数据库查询权限


//        LOGGER.info("preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        LOGGER.info("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        LOGGER.info("afterCompletion ex:" + ex);
    }
}
