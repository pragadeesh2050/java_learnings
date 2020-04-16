package com.luv2code.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/sample-full.json"),Student.class);
            System.out.println(student.getFirstName());
            System.out.println(student.getId());
            System.out.println(student.getLastName());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
