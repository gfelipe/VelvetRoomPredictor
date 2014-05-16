package com.ihniwimdcorp.vrp.controller.admin;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	
	public ModelAndView loadNavMenu ( HttpServletRequest request, HttpServletResponse response, String pageName ) {
		ModelAndView view = new ModelAndView( pageName );
		
		Map<String, String> navMenu = new LinkedHashMap<String, String>();
		
		navMenu.put("Arcanas", request.getContextPath()+"/admin/arcana/");
		navMenu.put("Games", request.getContextPath()+"/admin/game/");
		navMenu.put("Skill Cards", request.getContextPath()+"/admin/skillcard/");
		
		view.addObject("navMenu", navMenu);
		
		return view;
	}

}
