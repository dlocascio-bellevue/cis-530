/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler for managing custom exceptions.
 */
@RestControllerAdvice 
public class GlobalExceptionHandler {
    
    /**
     * Handles StudentNotFoundException and returns a structured error response.
     * @param ex The StudentNotFoundException instance.
     * @return A ResponseEntity containing the error details.
     */
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleStudentNotFoundException(StudentNotFoundException ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("message", ex.getMessage());
        errorResponse.put("status", HttpStatus.NOT_FOUND.value());
        errorResponse.put("timestamp", LocalDateTime.now());

        return new ResponseEntity<> (errorResponse, HttpStatus.NOT_FOUND);
    } // End of handleStudentNotFoundException method

} // End of GlobalExceptionHandler class
