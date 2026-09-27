/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import edu.bellevue.cis530.week02.model.Student;

/**
 * A repository for managing student data.
 */ 
@Repository 
public class StudentRepository {
    
    private final Map<Long, Student> students = new HashMap<>(); // In-memory storage for students.

    /**
     * Find all students.
     * @return A list of all students.
     */
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    } // End of findAll method

    /**
     * Find a student by ID.
     * @param id
     * @return The student with the specified ID, or null if not found.
     */
    public Student findById(Long id) {
        return students.get(id);
    } // End of findById method

    /**
     * Save a student.
     * @param student
     * @return The saved student.
     */
    public Student save(Student saveStudent) {
        students.put(saveStudent.getId(), saveStudent);
        return saveStudent;
    } // End of save method

    /**
     * Update a student by ID.
     * @param id
     * @param updateStudent
     * @return The updated student.
     */
    public Student update(Long id, Student updateStudent) {
        students.put(id, updateStudent);
        return updateStudent;
    } // End of update method

    /**
     * Delete a student by ID.
     * @param id
     */
    public void delete(Long id) {
        students.remove(id);
    } // End of delete method

} // End of StudentRepository class
