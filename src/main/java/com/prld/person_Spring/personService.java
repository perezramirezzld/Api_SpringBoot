package com.prld.person_Spring;

import java.util.List;

public interface personService {
    List<person>list();
    person listId(int id);
    person add(person p);
    person edit(person p);
    person delete(int id);
}
