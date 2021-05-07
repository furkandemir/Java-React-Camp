

import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer(1,"Furkan","Demir",new Date(1997,10,8),"24869375136");
		GamerManager gamermanager=new GamerManager(new MernisServiceAdapter());
		gamermanager.add(gamer);
		
		Game game=new Game(1,"Pubg",25);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		SalesManager sale =new SalesManager();
		sale.buy(game, gamer);
		
	}

}
