/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package com.locascio.week1._api.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 * This controller handles HTTP GET requests for the /api/hello and /api/info endpoints.
 */
@RestController 
public class HelloController {

    /**
     * GET /api/hello
     * Endpoint that returns a simple greeting message.
     * @return String
     */
    @GetMapping("/api/hello")
    public String hello() {
        return "Danny, Welcome to CIS-530 Course!";
    } //end hello

    /**
     * GET /api/info
     * Endpoint that returns a JSON object containing course, week, and technology information.
     * @return A Map<String, Object> containing course, week, and technology information.
     */
    @GetMapping("/api/info")
    public Map<String, Object> info() {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("course", "CIS-530");
        data.put("week", 1);
        data.put("technology", "Spring Boot");

        return data;
    } //end info 

} //end HelloController
