package com.punith.SpringWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        return "model";
    }

//    public String add(HttpServletRequest req, HttpSession session){
//        int num1=Integer.parseInt(req.getParameter("num1"));
//        int num2=Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//        session.setAttribute("result",result);
//        return "result.jsp";
//
//
//    }
//    @RequestMapping("details")
//    public String details(@RequestParam("name") String name, @RequestParam("email") String email, Model model){
//        model.addAttribute("name",name);
//        model.addAttribute("email",email);
//        return "result.jsp";
//
//
//    }
//@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv
    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){
        return "resu";
    }
    @ModelAttribute("course")
    public String Course(Alien alien){
        return alien.getAcourse();
    }
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien",alien);
//        mv.setViewName("resu");



}
