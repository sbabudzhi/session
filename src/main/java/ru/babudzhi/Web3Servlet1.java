package ru.babudzhi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/page1")
public class Web3Servlet1 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          try {
            /* возвращается ссылка на сессию для текущего пользователя (если сессия еще не существует, то она при этом создается) */
            response.setContentType("text/html;charset=utf8");
            HttpSession session = request.getSession();
            PrintWriter out = response.getWriter();

            String name1 = new String(request.getParameter("name").getBytes("iso-8859-1"), "utf8");
            session.setAttribute("name1", name1);

            out.println("<h2>Поздравляю с первым этапом!</h2> " +
                    "<p>Введите Ваше отчество </p>" +
                    "<form  action=\"page2\" method=\"post\"  accept-charset=\"UTF-8\">" +
                    "<input type=\"text\" name=\"middlename\">" + " " +
                    "<input type=\"submit\" value=\"Отправить\">" +
                    "</form>"
            );

           } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
