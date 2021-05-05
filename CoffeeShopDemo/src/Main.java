import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Furkan","Demir",LocalDate.of(1997,10,8),"2556841351"));
		System.out.println();

	}

}
