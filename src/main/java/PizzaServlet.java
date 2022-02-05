import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("address"));
        System.out.println(request.getParameter("phone"));
        System.out.println(request.getParameter("crust"));
        System.out.println(request.getParameter("sauce"));

// the other way I did it here.
        String size = request.getParameter("size");
        System.out.println("Pizza Crust Size: " + size);
//        String address = request.getParameter("address");
//        String address = request.setAttribute("address", address);
//        System.out.println("Address: " + address);
//        System.out.println("Toppings: ");

//        String[] toppings = request.getParameterValues("toppings");
//        for(String topping : toppings) {
//            System.out.println(topping);
        String[] topping = request.getParameterValues("toppings");
        for(int i = 0; i <= topping.length -1; i++){
            System.out.println(topping[i] + " ");
        }
    }
}
