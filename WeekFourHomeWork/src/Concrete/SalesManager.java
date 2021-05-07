package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SaleService{

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adli kullanici"+game.getName()+" adli oyunu basariyla satin aldi ");
		
	}

	@Override
	public void giveBack(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adli kullanici" +game.getName()+ " adli oyunu basariyla iade etti ");
		
	}

}
