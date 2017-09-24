package com.galaxy.module.global.util;

import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class MessageUtil {
    private static HttpServletRequest request;
    private static HttpServletResponse response;

    public static HttpServletRequest getServletRequest() {
        return request == null ? ServletActionContext.getRequest() : request;
    }

    public static HttpServletResponse getServletResponse() {
        return response == null ? ServletActionContext.getResponse() : response;
    }

    public static void sendMessage(String message) {
        try {
            getServletResponse().setCharacterEncoding("UTF-8");
            getServletResponse().setContentType("text/html");
            PrintWriter out = getServletResponse().getWriter();
            out.write(message);
            out.flush();
            //out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
