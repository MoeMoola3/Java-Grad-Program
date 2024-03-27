//package com.in28minutes.database.databasetut.jpa;
//
//public class PersonJpaRepository {
//}


package com.in28minutes.database.databasetut.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasetut.entity.Person;

import java.util.List;

@Repository
//@Transactional
@Transactional
public class PersonJpaRepository {

    //connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }

    public Person findById(int id) {
        return entityManager.find(Person.class, id);// JPA
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public Object deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
        return null;
    }
}
