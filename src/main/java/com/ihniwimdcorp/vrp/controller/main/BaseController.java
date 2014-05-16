package com.ihniwimdcorp.vrp.controller.main;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	
	public ModelAndView loadNavMenu ( HttpServletRequest request, HttpServletResponse response, String pageName ) {
		ModelAndView view = new ModelAndView( pageName );
		
		Map<String, String> navMenu = new LinkedHashMap<String, String>();
		
		navMenu.put("Double Fusion", request.getContextPath()+"/doublefusion/");
		navMenu.put("Triple Fusion", request.getContextPath()+"/triplefusion/");
		navMenu.put("Quadriple Fusion", request.getContextPath()+"/quadfusion/");
		navMenu.put("Pentagram Fusion", request.getContextPath()+"/pentafusion/");
		
		view.addObject("navMenu", navMenu);
		
		return view;
	}

}
