package com.beerhouse.integration;

import com.beerhouse.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest(classes = Application.class)
@ActiveProfiles("test")
@ContextConfiguration
public class CucumberRoot { }
