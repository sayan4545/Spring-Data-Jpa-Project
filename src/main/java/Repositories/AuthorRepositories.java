package Repositories;

import org.example.springbootdatajpademo01_final.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositories extends JpaRepository<Author,Integer> {

}
