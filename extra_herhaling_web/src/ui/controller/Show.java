package ui.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Show extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for(int i = 0; i < cookies.length; i++){
            if(cookies[i].getName().equals("veggie")){
                if (cookies[i].getValue().equals("yes")){
                    request.setAttribute("products", getProductService().allVegetarianProducts());
                    request.setAttribute("sort", true);
                    return "products.jsp";
                }else if(cookies[i].getValue().equals("no")) {
                    request.setAttribute("products", getProductService().allNonVegetarianProducts());
                    request.setAttribute("sort", true);
                    return "products.jsp";
                }else{
                    request.setAttribute("products", getProductService().getAll());
                    return "products.jsp";
                }
            }
        }
        request.setAttribute("products", getProductService().getAll());
        return "products.jsp";
    }
}
