package com.ihniwimdcorp.vrp.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ihniwimdcorp.vrp.dao.SkillCardDao;
import com.ihniwimdcorp.vrp.domain.Skill;
import com.ihniwimdcorp.vrp.domain.SkillCard;
import com.ihniwimdcorp.vrp.domain.wrappers.SkillCardWrapper;

@Controller("SkillCardController")
@RequestMapping("/admin/skillcard")
public class SkillCardController extends BaseController {
	
	@Autowired
	private SkillCardDao skillCardDao;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public ModelAndView listGames( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/skillCard/list");

		view.addObject("skillCards", skillCardDao.findAll());
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.GET )
	public ModelAndView createGame( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/skillCard/new");
		SkillCardWrapper skillCardWrapper = new SkillCardWrapper();
		skillCardWrapper.setSkill(new Skill());
		skillCardWrapper.setSkillCard(new SkillCard());
		
		view.addObject("skillCardWrapper", skillCardWrapper);
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	public String createGame( SkillCardWrapper skillCardWrapper, HttpServletResponse response, HttpServletRequest request ) {
		Skill skill = skillCardWrapper.getSkill();
		SkillCard skillCard = skillCardWrapper.getSkillCard();
		skillCard.setSkill(skill);

		skillCardDao.save(skillCard);
		return "redirect:";
	}
	
	@RequestMapping( value = "/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/skillCard/edit");
		SkillCard skillCard = skillCardDao.findById(id);
		
		SkillCardWrapper skillCardWrapper = new SkillCardWrapper(skillCard, skillCard.getSkill());
		view.addObject("skillCardWrapper", skillCardWrapper);
		
		return view;
	}
	
	@RequestMapping( value = "/edit", method = RequestMethod.POST )
	public String editGame( SkillCardWrapper skillCardWrapper, HttpServletResponse response, HttpServletRequest request ) {
		Skill skill = skillCardWrapper.getSkill();
		SkillCard skillCard = skillCardWrapper.getSkillCard();
		skillCard.setSkill(skill);

		skillCardDao.save(skillCard);
		return "redirect:";
	}
	
	@RequestMapping( value = "/delete/{id}", method = RequestMethod.GET )
	public ModelAndView deleteGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/skillCard/delete");
		SkillCard skillCard = skillCardDao.findById(id);
		view.addObject("skillCard", skillCard);
		
		return view;
	}
	
	@RequestMapping( value = "/delete", method = RequestMethod.POST )
	public String deleteGame( SkillCard skillCard, HttpServletResponse response, HttpServletRequest request ) {
		skillCardDao.delete(skillCard);
		return "redirect:";
	}

}
