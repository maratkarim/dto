package test.dto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.dto.dto.StudentDto;
import test.dto.mapper.StudentMapper;
import test.dto.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private String Marat;
    private String hello;

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentDto getById(Long id) {

//        StudentEntity studentEntity = studentRepository.findById(id).orElseThrow();
//        StudentDto studentDto = studentMapper.toDto(studentEntity);
//        return studentDto;

        return studentMapper.toDto(studentRepository.findById(id).orElseThrow());

    }

    public void createStudent(StudentDto studentDto) {

//        StudentEntity studentEntity = studentMapper.toEntity(studentDto);
//        studentRepository.save(studentEntity);

        studentRepository.save(studentMapper.toEntity(studentDto));

    }

    public List<StudentDto> getAll(){

//        List<StudentEntity> studentEntityList = studentRepository.findAll();
//        List<StudentDto> studentDtoList = studentMapper.toDtoList(studentEntityList);
//        return studentDtoList;

        return studentMapper.toDtoList(studentRepository.findAll());

    }

}