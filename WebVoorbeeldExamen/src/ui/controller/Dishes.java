package ui.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dishes extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("button", false);
        String value = null;
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("vegetarian")){
             value = cookies[i].getValue();
            }
        }
        if (value == null || value.trim().isEmpty()){
            return "Controller?action=Overview";
        }else if (value.equals("yes")){
            request.setAttribute("products", getProductService().allVegetarianProducts());
        }else if (value.equals("no")){
            request.setAttribute("products", getProductService().allNonVegetarianProducts());
        }else {
            return "Controller?action=Overview";
        }
        return "products.jsp";
    }
}
