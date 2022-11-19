package springIntro;

public class MsSqlCustomerDal implements ICustomerDal {
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Connection String : "+this.connectionString);
		System.out.println("MsSql veritabanına eklendi ");
		
	}

}
