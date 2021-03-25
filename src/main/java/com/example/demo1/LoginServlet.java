package com.example.demo1; /**
 * @Package ${PACKAGE_NAME}
 * @Description
 * @Author ASUS OR XXX
 * @Date 2021/3/25
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("test!");
        String userName=new String(request.getParameter("username")
                .getBytes("iso-8859-1"), "UTF-8");
        String password=request.getParameter("pwd");
        //控制台打印接收到的用户输入
        System.out.println("用户名："+userName+"密码:"+password);
    }
}
