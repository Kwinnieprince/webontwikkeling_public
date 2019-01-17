package ui.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowChosen extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        for(int i = 0; i < cookies.length; i++){
            if(cookies[i].getName().equals("veggie")){
                String choise = cookies[i].getValue();
                if(choise.equals("yes")){
                    request.setAttribute("products", getProductService().allVegetarianProducts());
                }else if (choise.equals("no")){
                    request.setAttribute("products", getProductService().allNonVegetarianProducts());
                }else{
                    request.setAttribute("products", getProductService().getAll());
                }
            }
        }
        return "products.jsp";
    }
}
