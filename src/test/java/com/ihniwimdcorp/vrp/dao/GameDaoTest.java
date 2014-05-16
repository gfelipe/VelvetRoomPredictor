package com.ihniwimdcorp.vrp.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ihniwimdcorp.vrp.domain.Game;

@RunWith(SpringJUnit4ClassRunner.class)
public class GameDaoTest extends AbstractDaoTest {

	@Autowired
	private GameDao gameDao;
	
	@Test
	public void save() {
		Game game = new Game();
		game.setName("Persona 3");
		game.setPlatform("Playstation 2");
		
		game = gameDao.save(game);
		
		assertEquals(new Long(1), game.getId());
	}

}
