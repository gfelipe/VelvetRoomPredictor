package com.ihniwimdcorp.vrp.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("AdminController")
@RequestMapping("/admin")
public class AdminController extends BaseController {
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public ModelAndView loadHome( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/index");
		
		return view;
	}

}
