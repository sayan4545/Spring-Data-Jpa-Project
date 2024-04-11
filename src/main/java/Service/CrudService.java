package Service;

import Repositories.AuthorRepositories;
import org.example.springbootdatajpademo01_final.Author;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

    AuthorRepositories repo ;

    public Author saveAuthor(Author author){
        return repo.save(author);
    }
    public Author getAuthorById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteAuthorById(Integer id) {
        repo.deleteById(id);
    }


}
