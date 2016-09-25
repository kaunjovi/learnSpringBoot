package fun.and.games;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {

	final static Logger logger = LoggerFactory.getLogger(MyApplication.class);

	public static void main(String[] args) {

		// This works fine. I am using logback behind the slf4j api.
		logger.debug("Hello world from Spring Boot.");

		ApplicationContext appContext = SpringApplication.run(
				MyApplication.class, args);

		// The system.out works all right. The debug does not. Why?
		// TODO: Find out why?
		logger.debug("Let's inspect the beans provided by Spring Boot: Logger");

		// Figure out what is in there?
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		
		String[] beanNames = appContext.getBeanDefinitionNames();

		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			if (beanName.matches("(.*)Controller"))
				System.out.println(beanName);
		}
		
//		ConfigurableListableBeanFactory beansFactory = ((ConfigurableListableBeanFactory)appContext).getBeanFactory();
//		String[] beansNames =  beansFactory.getBeanDefinitionNames();
//		Set<String> beansType = new HashSet<>();
//
//		for(String beanName : beansNames){
//		    beansType.add(beansFactory.getType(beanName).toString());
//		}
	}
}
