package springIntro;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal =  customerDal;
	}

	//setter injection yaparakta bu sistemide yapabiliriz.
	@Override
	public void add() {
		// iş kurallarını calisirim.
		customerDal.add();
	}

}
