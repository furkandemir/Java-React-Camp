package Concrete;



import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	GamerCheckService gamerCheck;
	
	public GamerManager(GamerCheckService gamercheckservice) {
		this.gamerCheck=gamercheckservice;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheck.CheckIfRealPerson(gamer)) {
			System.out.println("Kullanýcý sisteme kaydedildi: "+ gamer.getFirstName());
		}else {
			System.out.println("Kaydedilemedi");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý silindi");
		
		
	}
	
	
	

}
