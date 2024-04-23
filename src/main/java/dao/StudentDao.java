package dao;

import model.Student;

public interface StudentDao {
    void deleteById(Integer id);

    Student save(Student student);

}
