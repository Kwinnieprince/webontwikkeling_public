package ui.controller.actions;

import domain.db.Role;
import ui.controller.RequestHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Login extends RequestHandler {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String password = request.getParameter("password");
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        if (session.getAttribute("role") != null){
            session.removeAttribute("role");
        }
        try {
            if(getService().check(id, password)){
                session.setAttribute("role", Role.ADMIN);
            }else{
                session.setAttribute("role", Role.CUSTOMER);
            }
        }catch (UnsupportedEncodingException e){

        }catch (NoSuchAlgorithmException e){

        }catch (NullPointerException e){
            return "check.jsp";
        }
        return "index.jsp";

    }
}
