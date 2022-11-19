import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements ICustomerDal{
	@Value("${connectionString}")
	private String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String : "+this.connectionString);
		
		System.out.println("Oracle veritabanına eklendi");
	}

}
