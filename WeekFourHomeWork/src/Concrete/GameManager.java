package Concrete;


import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" oyunu eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" oyunu silindi");
		
	}

	
}
