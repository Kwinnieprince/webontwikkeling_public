package ui.controller.actions;

import ui.controller.Controller;
import ui.controller.RequestHandler;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.zip.DataFormatException;

public class Quote extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String quote = request.getParameter("quote");
        Cookie cookie;
        try {
            if(quote.equals("yes")){
                cookie = new Cookie("quote", "yes");
            }else{
                cookie = new Cookie("quote", "no");
            }
        }catch (NullPointerException e){
            return "Controller";
        }
        request.setAttribute("quote", cookie.getValue());
        response.addCookie(cookie);
        try {
            response.sendRedirect("index.jsp");
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        Controller.setSendRedirect();
        return "index.jsp";
    }
}
