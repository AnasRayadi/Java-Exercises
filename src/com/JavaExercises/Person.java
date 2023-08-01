package com.JavaExercises;

public class Person {
    private String firstName,lastName;
    private Gender gender;
    private String email;
    public enum Gender{
        MALE,FEMALE
    }
    public Person(String firstName,String lastName,Gender gender,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.email=email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Gender getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }

}
