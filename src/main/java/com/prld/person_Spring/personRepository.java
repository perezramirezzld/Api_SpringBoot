/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prld.person_Spring;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author ASUS LAPTOP
 */
public interface personRepository extends Repository<person, Integer>{
    List<person>findAll();
    person findById(int id);
    person save(person p);
    person delete(person p);
}
