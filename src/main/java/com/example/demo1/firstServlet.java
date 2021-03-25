package com.example.demo1; /**
 * @Package ${PACKAGE_NAME}
 * @Description
 * @Author ASUS OR XXX
 * @Date 2021/3/18
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "firstServlet", value = "/firstServlet")
public class firstServlet extends HttpServlet {
    public firstServlet()
    {
        System.out.println("访问");
    }


    public void destroy()
    {
        System.out.println("销毁");
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


     /* PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "this" + "</h1>");
        out.println("</body></html>");*/
        System.out.println("初始化");

        System.out.println("OK!");
        ServletContext ctxt =this.getServletContext();

        Integer count=(Integer) ctxt.getAttribute("count");
        if(count ==null)
        {
            count =0;
        }
        count ++;
        ctxt.setAttribute("count",count);


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"+count+"</h1>");
        out.println("</body></html>");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
