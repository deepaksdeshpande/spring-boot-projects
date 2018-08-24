package com.spring.cassandra.repos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.cassandra.entity.Person;

@Repository
public interface PersonRepository extends CassandraRepository<Person, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findById(java.lang.Object)
	 */
	Optional<Person> findById(String id);

	List<Person> findAll();

	/**
	 * Sample method to derive a query from using JDK 8's {@link Optional} as return type.
	 *
	 * @param id
	 * @return
	 */
	@Query("select * from person where id = ?0")
	Optional<Person> findPersonById(String id);

	/**
	 * Sample default method to show JDK 8 feature support.
	 *
	 * @param person
	 * @return
	 */
	default Optional<Person> findByPerson(Person person) {
		return findPersonById(person == null ? null : person.getId());
	}

	void deleteAll();

	@SuppressWarnings("unchecked")
	Person save(Person person);
}
