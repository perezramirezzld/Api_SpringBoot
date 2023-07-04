
package com.prld.person_Spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/list")
@RestController
@RequestMapping({"/person"})
public class Controller {
    @Autowired
    personService service;
    
    @GetMapping
    public List<person>list(){
     return service.list();
    }
}
