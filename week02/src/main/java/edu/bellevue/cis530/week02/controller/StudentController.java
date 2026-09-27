/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bellevue.cis530.week02.model.Student;
import edu.bellevue.cis530.week02.service.StudentService;

/**
 * REST controller for managing students.
 */
@RestController 
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    /**
     * Constructor for StudentController.
     * @param studentService The student service to use.
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    } // End of constructor

    /**
     * Gets all students.
     * @return A list of all students.
     */
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    } // End of getAllStudents()

    /**
     * Gets a student by ID.
     * @param id The ID of the student to get.
     * @return The student with the ((specified ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return ResponseEntity.ok(student);
    } // End of getStudentById

    /**
     * Creates a new student.
     * @param student The student to create.
     * @return The created student.
     */
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.save(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    } // End of createStudent

    /**
     * Updates an existing student.
     * @param id The ID of the student to update.
     * @param student The updated student information.
     * @return The updated student.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.update(id, student);
        return ResponseEntity.ok(updatedStudent);
    } // End of updateStudent

    /**
     * Deletes a student.
     * @param id The ID of the student to delete.
     * @return A response indicating the result of the operation.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    } // End of deleteStudent

} // End of StudentController