package com.codeclan.FileFolderHomework.repositories;

import com.codeclan.FileFolderHomework.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
