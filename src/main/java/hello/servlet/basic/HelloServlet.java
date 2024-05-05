package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request); // 인터페이스를 통한 구현체 출력  httpServletRequest는 인터페이스다.
        System.out.println("response = " + response);

        String username = request.getParameter("username"); //쿼리에 들어간 파라미터를 조회할 수 있다.
        System.out.println("username = " + username);

        response.setContentType("text/plain"); //contest에 들어감
        response.setCharacterEncoding("utf-8");//요즘엔 다들 utf-8을 사용한다. context에 들어감
        response.getWriter().write("hello"+username);
    }
}
