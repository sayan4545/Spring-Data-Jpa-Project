package Controller;

import Service.CrudService;
import org.example.springbootdatajpademo01_final.Author;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityRestController {

    CrudService crudService;

    @PostMapping("/saveEntity")
    public Author saveAuthor(@RequestBody Author author){
        return crudService.saveAuthor(author);
    }

}
