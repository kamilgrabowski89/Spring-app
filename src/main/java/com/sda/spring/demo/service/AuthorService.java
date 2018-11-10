package com.sda.spring.demo.service;

import com.sda.spring.demo.exceptions.AuthorNotFoundException;
import com.sda.spring.demo.interfaces.AuthorInterface;
import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements AuthorInterface {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow(() ->new AuthorNotFoundException(id));
    }

    @Override
    public Author findByLastname(String lastname) {
        return authorRepository.findByLastname(lastname);
    }

    public Author findByName(String name){
        return authorRepository.findByName(name);
    }
}
