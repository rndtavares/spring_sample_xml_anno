import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsigth.service.CustumerService;
import com.pluralsigth.service.CustumerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustumerService service = appContext.getBean("custumerService", CustumerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
		
	}

}
