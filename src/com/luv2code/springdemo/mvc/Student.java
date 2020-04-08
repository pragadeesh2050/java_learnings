package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;

    @NotNull(message = "is Required")
    @Size(min=1, message = "is Required")
    private String lastName;
    private String country;



    @CourseCode(value="XYZ", message="value should start from XYZ")
    private String courseCode;

    private String favouriteCodeLanguage;

    @NotNull(message = "is required")
    @Min(value = 18, message = "Age should be greater than 18")
    @Max(value = 28, message= "Age should be less than 30")
    private Integer age;

    private LinkedHashMap<String,String> listOfCountries;

    public Student() {
        this.listOfCountries = new LinkedHashMap<>();
        getListOfCountries().put("BR", "Brazil");
        getListOfCountries().put("IN", "India");
        getListOfCountries().put("FR", "France");
        getListOfCountries().put("IT", "Italy");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getFavouriteCodeLanguage() {
        return favouriteCodeLanguage;
    }

    public void setFavouriteCodeLanguage(String favouriteCodeLanguage) {
        this.favouriteCodeLanguage = favouriteCodeLanguage;
    }

    public LinkedHashMap<String, String> getListOfCountries() {
        return listOfCountries;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
