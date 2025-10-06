package test.dto.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.dto.dto.StudentDto;
import test.dto.service.StudentService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentApi {

    private final StudentService studentServices;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(studentServices.getById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(studentServices.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody StudentDto studentDto){
        studentServices.createStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
