/*
    Locascio, D. CIS 530 Server Side Development. Bellevue University, all right reserved.
*/

package edu.bellevue.cis530.week02.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * A bean that provides API information.
 * This bean is a prototype-scoped Spring component, meaning a new instance will be created each time it is requested.
 */
@Component
@Scope("prototype")
public class ApiInfoBean {

    /**
     * Constructor for ApiInfoBean.
     * Prints a message indicating that the constructor has been called.
     */
    public ApiInfoBean() {
        System.out.println("ApiInfoBean constructor called");
    } // End of constructor

    /**
     * Initializes the ApiInfoBean.
     * This method is called after the bean has been constructed and dependencies have been injected.
     */
    @PostConstruct
    public void init() {
        System.out.println("ApiInfoBean initialized");
        System.out.println("ApiInfoBean hashCode: " + this.hashCode()); // Print the hash code of the bean
    } // End of init method

    /**
     * Cleans up the ApiInfoBean.
     * This method is called before the bean is destroyed.
     */
    @PreDestroy
    public void destroy() {
        System.out.println("ApiInfoBean destroyed");
    } // End of destroy method

} // End of ApiInfoBean class()
