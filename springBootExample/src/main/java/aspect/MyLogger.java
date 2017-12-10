/**
 * 
 */
package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by abhik
 * on 23-Jul-2017
 */
@Aspect
public class MyLogger {

	@Before("within(com.example.khard.service..*)")
	public void beforeLogging() {
		System.out.println("");
	}
}
