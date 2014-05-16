package com.ihniwimdcorp.vrp.controller.admin;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ihniwimdcorp.vrp.dao.PersonaDao;
import com.ihniwimdcorp.vrp.domain.FusionSpell;
import com.ihniwimdcorp.vrp.domain.Game;
import com.ihniwimdcorp.vrp.domain.HeartItem;
import com.ihniwimdcorp.vrp.domain.Skill;
import com.ihniwimdcorp.vrp.domain.Persona;
import com.ihniwimdcorp.vrp.domain.SkillCard;
import com.ihniwimdcorp.vrp.domain.wrappers.PersonaWrapper;

@Controller("PersonaController")
@RequestMapping("/admin/persona")
public class PersonaController extends BaseController {
	
	@Autowired
	private PersonaDao personaDao;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public ModelAndView listGames( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/persona/list");

		view.addObject("skillCards", personaDao.findAll());
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.GET )
	public ModelAndView createGame( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/persona/new");
		PersonaWrapper personaWrapper = wrap(new Persona());
		
		view.addObject("personaWrapper", personaWrapper);
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	public String createGame( PersonaWrapper personaWrapper, HttpServletResponse response, HttpServletRequest request ) {
		Persona persona = unwrap(personaWrapper);
		
		personaDao.save(persona);
		return "redirect:";
	}
	
	@RequestMapping( value = "/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/persona/edit");
		Persona persona = personaDao.findById(id);
		
		PersonaWrapper personaWrapper = wrap(persona);
		personaWrapper.setPersona(persona);
		
		view.addObject("personaWrapper", personaWrapper);
		
		return view;
	}
	
	@RequestMapping( value = "/edit", method = RequestMethod.POST )
	public String editGame( PersonaWrapper personaWrapper, HttpServletResponse response, HttpServletRequest request ) {
		Persona persona = unwrap(personaWrapper);
		
		personaDao.save(persona);
		return "redirect:";
	}
	
	@RequestMapping( value = "/delete/{id}", method = RequestMethod.GET )
	public ModelAndView deleteGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/persona/delete");
		Persona persona = personaDao.findById(id);
		view.addObject("persona", persona);
		
		return view;
	}
	
	@RequestMapping( value = "/delete", method = RequestMethod.POST )
	public String deleteGame( Persona persona, HttpServletResponse response, HttpServletRequest request ) {
		personaDao.delete(persona);
		return "redirect:";
	}
	
	private PersonaWrapper wrap(Persona persona) {
		PersonaWrapper personaWrapper = new PersonaWrapper();
		personaWrapper.setGame(new Game());
		personaWrapper.setFusionSpell(new FusionSpell());
		personaWrapper.setHeartItem(new HeartItem());
		personaWrapper.setSkills(new ArrayList<Skill>());
		personaWrapper.setSkillCard(new SkillCard());
		personaWrapper.setPersona(persona);
		return personaWrapper;
	}
	
	private Persona unwrap(PersonaWrapper personaWrapper) {
		Persona persona = personaWrapper.getPersona();
		List<Skill> skills = personaWrapper.getSkills();
		
		for (Skill skill : skills) {
			skill.setPersona(persona);
		}
		
		persona.setSkills(skills);
		persona.setGame(personaWrapper.getGame());
		persona.setHeartItem(personaWrapper.getHeartItem());
		persona.setFusionSpell(personaWrapper.getFusionSpell());
		persona.setSkillCard(personaWrapper.getSkillCard());
		persona.setStatus(personaWrapper.getStatus());
		return persona;
	}

}
