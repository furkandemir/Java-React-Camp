package Abstract;

import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	public void buy(Game game, Gamer gamer);
	public void giveBack(Game game, Gamer gamer);

}
