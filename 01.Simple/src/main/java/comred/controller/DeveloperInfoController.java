package comred.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * re-naming package automatically creates and move file to that 
 * new package name
 */

@RestController
@RequestMapping("/developer")
public class DeveloperInfoController {

    @GetMapping("/fullname")
    public String GetFullName() {
      return "Joshua.Carpentier";	
    }
    
    
    @GetMapping("/email")
    public String GetEmail() {
      return "joshuacarpentier21@gmail.com";	
    }
	
}
