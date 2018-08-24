package com.spring.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.cassandra.entity.Person;
import com.spring.cassandra.repos.PersonRepository;

@SpringBootApplication
public class SpringBootCassandraApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository personRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("1", "Homer", "Simpson"));
		personRepository.save(new Person("2", "Bart", "Simpson"));

	}

}
