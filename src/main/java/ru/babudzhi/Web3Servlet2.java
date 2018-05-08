package ru.babudzhi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/page2")
public class Web3Servlet2 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            /* возвращается ссылка на сессию для текущего пользователя (если сессия еще не существует, то она при этом создается) */
            response.setContentType("text/html;charset=utf8");
            HttpSession session = request.getSession();
            PrintWriter out = response.getWriter();

            String middlename1 = new String(request.getParameter("middlename").getBytes("iso-8859-1"), "utf8");
            session.setAttribute("middlename1", middlename1);

            out.println("<h2>Поздравляю со вторым этапом!</h2> " +
                    "<p>Введите Вашу фамилию</p>" +
                    "<form  action=\"page3\" method=\"post\"  accept-charset=\"UTF-8\">" +
                    "<input type=\"text\" name=\"lastname\">" + " " +
                    "<input type=\"submit\" value=\"Отправить\">" +
                    "</form>"
            );

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
