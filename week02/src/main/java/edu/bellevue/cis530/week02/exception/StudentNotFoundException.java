/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.exception;

/**
 * Exception thrown when a student with a specified ID is not found.
 */
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("Student with id " + id + " not found.");
    } // End of constructor
    
} // End of StudentNotFoundException class
