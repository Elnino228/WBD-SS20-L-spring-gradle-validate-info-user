package com.codegym;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //tuong ung voi khai bao dispatcher-servlet.xml
    protected Class<?>[] getRootConfigClasses(){
        return new  Class[]{AppConfig.class};
    }

    @Override
    //tuong ung khai bao dispatcher
    protected Class<?>[] getServletConfigClasses(){
        return new Class[0];
    }

    @Override
    //tuong ung khai bao Mapping "/"
    protected String[] getServletMappings(){
        return new String[]{"/"};
    }
}
