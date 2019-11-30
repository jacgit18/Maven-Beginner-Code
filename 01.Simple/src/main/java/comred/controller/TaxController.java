package comred.controller;

// import java.util.stream.IntStream;
import static java.util.stream.IntStream.rangeClosed;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxyears")
public class TaxController {
    
	@GetMapping("/years")
	public int[] getTaxYears() {
		
		int years[] = rangeClosed(1964, 2020).toArray();
		// find out how to do 2020 to 1964
		
		// import static java.util.stream.IntStream.rangeClosed;
		// makes so you don,t need to type : IntStream in the years array
		// int years[] = "IntStream".rangeClosed(1965, 2019).toArray();
		return years;


		/*
		 *
		int start = 1967, end = 2019;
		int size = end - start;
		int years[] = new int [size];
		
		// more efficient to get size variable from the actual size variable instead of the years array like at the bottom
		for (int i = 0; i < size; i++) {
			years [i] = start++; 
				
		}
			* 
		 */
		
		
		
			/* 
			 * for (int i = 0; i < years.length; i++) {
			
		       }
			 * 
			 */
		
		
		
		
	}
	
	
	
}
