import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//This servlet define the login successful of login

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        out.println("<html><head>\n" +
//                "    <meta charset=\"UTF-8\">\n" +
//                "    <title>Login</title>\n" +
//                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
//                "</head><body>" +
//                "<div class=\"container\">"+
//                "<a class=\"m-auto fs-2 text-decoration-none\" href='productList.jsp'>Go to Product Page</a>" +
//                "</body></html>");

        out.println("<html><head>" +
                        "<meta charset=\"UTF-8\">\n" +
                        "<title>LoginServlet</title>\n" +
                        "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                        "</head><body style=\"background-image=\"./images/bgimg.jpg\">" +
                        "<div class=\"container\">"+
        "<h1 style=\"color:#880e4f; text-align: center;font-family:arial-bold;margin-top: 50px \">Welcome to Shopping Zone BD</h1>"+
                "<a style=\"text-align: center; color: crimson;font-size: 35px;\" href='productList.jsp'>Go to Product Page</a>" +
                "<button style=\"color: green;margin-left:750px;width: 100px; height: 60px;border-radius: 18%; border: 2px solid black;align-items: center;font-size:24px;\"button\" value=\"Logout\">Logout</button>\n"+
  "</div></body></html>");
    }
}
