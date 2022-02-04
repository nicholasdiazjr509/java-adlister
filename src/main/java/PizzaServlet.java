import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "Pizza Servlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String crustType = request.getParameter("crust");
            System.out.println("Crust type: " + crustType);

        String pizzaSize = request.getParameter("size");
            System.out.println("Pizza Crust Size: " + pizzaSize);

        String address = request.getParameter("address");
            request.setAttribute("address", address);
        System.out.println("Address: " + address);

        System.out.println("Toppings: ");
        String[] topping = request.getParameterValues("toppings");
            for(int i = 0; i <= topping.length -1; i++){
                System.out.println(topping[i] + " ");
        }
        System.out.println();
    }
}
