package vn.edu.sp_demo333.controller;

import org.springframework.web.bind.annotation.*;
import vn.edu.sp_demo333.entity.Students;
import vn.edu.sp_demo333.repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Students> getAllStudent(){
        return repository.findAll();
    }

    @PostMapping
    public Students addStudent(@RequestBody Students student){
        return this.repository.save(student);
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id){
        return this.repository.findById(id).orElse(null);
    }
}
