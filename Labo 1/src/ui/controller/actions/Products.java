package ui.controller.actions;

import domain.model.Product;
import ui.controller.RequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Products extends RequestHandler {

    public Products(){
    }

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("products", getService().getAll());
        return "products.jsp";
    }
}
