package ui.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Vegetarian extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("vegetarian", request.getParameter("veggie"));
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
