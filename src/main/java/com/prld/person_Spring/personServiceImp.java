
package com.prld.person_Spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personServiceImp implements personService {
    @Autowired
    private personRepository repository;
    
    @Override
    public List<person> list() {
       return repository.findAll();
    }
    
    @Override
    public person listId(int id) {
       return repository.findById(id);
    }

    @Override
    public person add(person p) {
        return repository.save(p);
    }

    @Override
    public person edit(person p) {
        return repository.save(p);
    }

    @Override
    public person delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
