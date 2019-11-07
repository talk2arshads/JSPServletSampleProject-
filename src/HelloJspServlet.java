
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloJspServlet
 */
@WebServlet("/helloServlet")
public class HelloJspServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloJspServlet() {

        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        final String yourName = request.getParameter("yourName");
        final String yourColor = request.getParameter("yourColor");
        final PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello " + yourName + "</h1> ");
        writer.println("<!DOCTYPE html PUBLIC \\\"-//W3C//DTD HTML 4.01 Transitional//EN"
                + "          http://www.w3.org/TR/html4/loose.dtd><html><head>"
                + "          <meta http-equiv=\\\"Content-Type\\\" content=\\\"text/html charset=ISO-8859-1"// >"
                + "          <title> My first jsp  </title> </head><body><font size=\\\"12px\\\" color=" + yourColor + "> Hello "
                + yourName + "</font></body></html>");
        writer.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        // TODO Auto-generated method stub
        this.doGet(request, response);
    }

}
