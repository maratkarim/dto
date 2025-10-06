package test.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import test.dto.dto.StudentDto;
import test.dto.entity.StudentEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(target = "firstNameDto", source = "firstNameEntity")
    @Mapping(target = "lastNameDto", source = "lastNameEntity")
    StudentDto toDto(StudentEntity studentEntity);

    @Mapping(target = "firstNameEntity", source = "firstNameDto")
    @Mapping(target = "lastNameEntity", source = "lastNameDto")
    StudentEntity toEntity(StudentDto studentDto);

    List<StudentDto> toDtoList(List<StudentEntity> studentEntityList);

}
