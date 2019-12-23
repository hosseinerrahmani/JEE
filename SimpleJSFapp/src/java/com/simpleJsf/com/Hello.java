/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simpleJsf.com;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ho
 */
@Named(value = "hello")
@ManagedBean
@RequestScoped
public class Hello {

    /**
     * Creates a new instance of Hello
     */
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String say_hello_ajax(){
        return "hello Ajax";
    }
    
    public String say_salam_ajax() {
        if (name ==null || name.equals("")){
            return "";
        }else{
            return "salam Ajax "+name;
        }
    }
    
}
