package Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //out.write()只能将字符、字符串、ASCII码写入到响应体
        int n=90;

        //设置响应头Content-type
        String s="你好<br>世界";
        response.setContentType("text/html;charset=utf-8");

        //设置响应头中的location属性
        String m="http://www.baidu.com";
        response.sendRedirect(m);

        PrintWriter out = response.getWriter();
        out.print(n);
        out.print(s);
    }
}
