/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bellevue.cis530.week02.exception.StudentNotFoundException;
import edu.bellevue.cis530.week02.model.Student;
import edu.bellevue.cis530.week02.repository.StudentRepository;

/**
 * Service class for managing student operations.
 */
@Service 
public class StudentService {

    private final StudentRepository studentRepository;

    /**
     * Constructor for StudentService.
     * @param studentRepository
     */
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    } // End of constructor

    /**
     * Finds all students.
     * @return List of all students.
     */
    public List<Student> findAll() {
        return studentRepository.findAll();
    } // End of findAll method

    /**
     * Finds a student by ID.
     * @param id The ID of the student to find.
     * @return The student with the specified ID.
     * @throws StudentNotFoundException if the student with the specified ID is not found.
     */
    public Student findById(Long id) {
        Student student = studentRepository.findById(id);
        if (student == null) {
            throw new StudentNotFoundException(id);
        }
        return student;
    } // End of findById method

    /**
     * Saves a student.
     * @param students The student to save.
     * @return The saved student.
     */
    public Student save(Student student) {
        return studentRepository.save(student);
    } // End of save method

    /**
     * Updates a student.
     * @param id The ID of the student to update.
     * @param updateStudent The student with updated information.
     * @return The updated student.
     * @throws StudentNotFoundException if the student with the specified ID is not found.
     */
    public Student update(Long id, Student updateStudent) {
        if(studentRepository.findById(id) == null) {
            throw new StudentNotFoundException(id);
        }
        return studentRepository.update(id, updateStudent);
    } // End of update method

    /**
     * Deletes a student by ID.
     * @param id The ID of the student to delete.
     * @throws StudentNotFoundException if the student with the specified ID is not found.
     */
    public void delete(Long id) {
        if(studentRepository.findById(id) == null) {
            throw new StudentNotFoundException(id);
        }
        studentRepository.delete(id);
    } // End of delete method

} // End of StudentService class
