package com.sda.spring.demo.repository;

import com.sda.spring.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {
    Author findByLastname(String value);
    Author findByName(String name);
}
