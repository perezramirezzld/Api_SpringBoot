
package com.prld.person_Spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/person"})
public class Controller {
    @Autowired
    personService service;
    
    @GetMapping
    public List<person>list(){
     return service.list();
    }
    
    @PostMapping
    public person add(@RequestBody person p){
     return service.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public person listId(@PathVariable("id") int id){
     return service.listId(id);
    }
    
    @PutMapping(path = {"/{id}"})
    public person edit(@RequestBody person p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
}
