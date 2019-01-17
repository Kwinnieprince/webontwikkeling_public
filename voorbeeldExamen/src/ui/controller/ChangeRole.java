package ui.controller;

import domain.db.Role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChangeRole extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        if (session.getAttribute("role") == null){
            session.setAttribute("role", Role.ADMIN);
        }else if (session.getAttribute("role").equals(Role.ADMIN)){
            session.invalidate();
        }
        return "index.jsp";
    }
}
