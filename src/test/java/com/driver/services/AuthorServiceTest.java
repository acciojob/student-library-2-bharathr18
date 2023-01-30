package com.driver.services;

import com.driver.models.Author;
import com.driver.repositories.AuthorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuthorServiceTest {
    @InjectMocks
    AuthorService authorService;

    @Mock
    AuthorRepository authorRepository;

    @Test
    public void testCreate(){
        authorService.create(new Author("1", "1@gmail.com", 21, "India"));
    }
}
