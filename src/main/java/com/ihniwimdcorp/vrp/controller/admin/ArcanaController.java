package com.ihniwimdcorp.vrp.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ihniwimdcorp.vrp.dao.ArcanaDao;
import com.ihniwimdcorp.vrp.domain.Arcana;

@Controller("ArcanaController")
@RequestMapping("/admin/arcana")
public class ArcanaController extends BaseController {
	
	@Autowired
	private ArcanaDao arcanaDao;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public ModelAndView listGames( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/arcana/list");

		view.addObject("arcanas", arcanaDao.findAll());
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.GET )
	public ModelAndView createGame( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/arcana/new");
		Arcana arcana = new Arcana();
		view.addObject("arcana", arcana);
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	public String createGame( Arcana arcana, HttpServletResponse response, HttpServletRequest request ) {
		arcanaDao.save(arcana);
		return "redirect:";
	}
	
	@RequestMapping( value = "/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/arcana/edit");
		Arcana arcana = arcanaDao.findById(id);
		view.addObject("arcana", arcana);
		
		return view;
	}
	
	@RequestMapping( value = "/edit", method = RequestMethod.POST )
	public String editGame( Arcana arcana, HttpServletResponse response, HttpServletRequest request ) {
		arcanaDao.save(arcana);
		return "redirect:";
	}
	
	@RequestMapping( value = "/delete/{id}", method = RequestMethod.GET )
	public ModelAndView deleteGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/arcana/delete");
		Arcana arcana = arcanaDao.findById(id);
		view.addObject("arcana", arcana);
		
		return view;
	}
	
	@RequestMapping( value = "/delete", method = RequestMethod.POST )
	public String deleteGame( Arcana arcana, HttpServletResponse response, HttpServletRequest request ) {
		arcanaDao.delete(arcana);
		return "redirect:";
	}

}
