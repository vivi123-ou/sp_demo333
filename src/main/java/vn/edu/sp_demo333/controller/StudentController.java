package vn.edu.sp_demo333.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.sp_demo333.entity.Students;
import vn.edu.sp_demo333.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Students> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Students add(@Valid @RequestBody Students student) {
        return service.add(student);
    }

    @GetMapping("/{id}")
    public Students getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Deleted student id: " + id);
    }
}