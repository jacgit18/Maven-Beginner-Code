package comred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _app {

	/*
	 * this file has to be root or at least above what your running in it
	 * so when changing the package name that new package that was created
	 * will be next to this main class instead of under so make sure to name 
	 * the package so that it is under the main class so comred will be ahead 
	 * of comred.controller because the file is ordered alphabetically
	 */
	
	
	public static void main(String[] args) {
        SpringApplication.run(_app.class, args);
	}

}
