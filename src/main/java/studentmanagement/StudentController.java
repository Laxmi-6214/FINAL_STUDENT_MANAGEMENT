package studentmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return repo.findAll();
    }
    
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        repo.deleteById(id);
        return "Student deleted successfully";
    }
    
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return repo.save(student);
    }
}
