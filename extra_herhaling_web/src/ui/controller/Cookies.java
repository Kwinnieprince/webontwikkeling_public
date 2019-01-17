package ui.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("veggie", request.getParameter("veggie"));
        response.addCookie(cookie);
        Controller.setSendRedirect();
        return "Controller";
    }
}
