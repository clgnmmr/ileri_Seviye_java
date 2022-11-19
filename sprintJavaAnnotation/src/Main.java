

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String [] args)  {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService customerService=context.getBean("service",ICustomerService.class);
	   //CustomerManager manager=new CustomerManager(context.getBean("database",ICustomerDal.class));
		//ICustomerDal customerDal=context.getBean("database",ICustomerDal.class);
		customerService.add();
		
		
		
	}
	//IoC - Inversion of Control
	//Dependency Injection
	// Spagetti Code 
	//yapıyrouz be spro eclipse ile gelistirme yapabiliyorum :)
	//SOLID  yazilim gelistirme ozellikleri

}
