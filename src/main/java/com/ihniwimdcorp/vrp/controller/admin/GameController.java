package com.ihniwimdcorp.vrp.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ihniwimdcorp.vrp.dao.GameDao;
import com.ihniwimdcorp.vrp.domain.Game;

@Controller("GameController")
@RequestMapping("/admin/game")
public class GameController extends BaseController {
	
	@Autowired
	private GameDao gameDao;
	
	@RequestMapping( value = "/", method = RequestMethod.GET )
    public ModelAndView listGames( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/game/list");

		view.addObject("games", gameDao.findAll());
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.GET )
	public ModelAndView createGame( HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/game/new");
		Game game = new Game();
		view.addObject("game", game);
		
		return view;
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	public String createGame( Game game, HttpServletResponse response, HttpServletRequest request ) {
		gameDao.save(game);
		return "redirect:";
	}
	
	@RequestMapping( value = "/edit/{id}", method = RequestMethod.GET )
	public ModelAndView editGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/game/edit");
		Game game = gameDao.findById(id);
		view.addObject("game", game);
		
		return view;
	}
	
	@RequestMapping( value = "/edit", method = RequestMethod.POST )
	public String editGame( Game game, HttpServletResponse response, HttpServletRequest request ) {
		gameDao.save(game);
		return "redirect:";
	}
	
	@RequestMapping( value = "/delete/{id}", method = RequestMethod.GET )
	public ModelAndView deleteGame( @PathVariable Long id, HttpServletResponse response, HttpServletRequest request ) {
		ModelAndView view = loadNavMenu(request, response, "admin/game/delete");
		Game game = gameDao.findById(id);
		view.addObject("game", game);
		
		return view;
	}
	
	@RequestMapping( value = "/delete", method = RequestMethod.POST )
	public String deleteGame( Game game, HttpServletResponse response, HttpServletRequest request ) {
		gameDao.delete(game);
		return "redirect:";
	}

}
