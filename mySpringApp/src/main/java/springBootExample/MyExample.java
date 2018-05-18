/**
 * 
 */
package springBootExample;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by abhik
 * on 21-Jul-2017
 */

//@RestController
/*@Configuration
@EnableAutoConfiguration
@ComponentScan({"services", "controller", "com.example.khard"})*/
//@EnableWebMvc
@SpringBootApplication(scanBasePackages = {"services", "controller", "com.example.khard"})
public class MyExample {

/*	@Autowired
	DataSource datasource;
*/	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(MyExample.class, args);
	}
	
}
