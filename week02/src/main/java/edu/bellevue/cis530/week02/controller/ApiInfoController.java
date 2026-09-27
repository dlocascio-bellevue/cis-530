/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bellevue.cis530.week02.config.ApiInfoBean;

/**
 * A controller for providing API information.
 */
@RestController
public class ApiInfoController {

    private final ApiInfoBean apiInfoBean;

    /**
     * Constructor for ApiInfoController.
     * @param apiInfoBean the API info bean
     */
    public ApiInfoController(ApiInfoBean apiInfoBean) {
        this.apiInfoBean = apiInfoBean;
    } // End of constructor

    /**
     * Retrieves API information.
     * @return a message indicating where to check the console for ApiInfoBean output
     */
    @GetMapping("/api/info")
    public String getInfo() {
        return "Check console for ApiInfoBean lifecycle and hashCode output.";
    } // End of getInfo method

}   // End of ApiInfoController class
