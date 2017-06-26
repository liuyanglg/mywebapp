package com.galaxy.project.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Galaxy on 2017/3/18.
 */
public interface BaseAction extends ServletRequestAware,ServletResponseAware{
    @Override
    void setServletRequest(HttpServletRequest httpServletRequest);

    @Override
    void setServletResponse(HttpServletResponse httpServletResponse);
}
