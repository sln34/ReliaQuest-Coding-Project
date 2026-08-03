package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

public class EmployeeModel implements Employee {

    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant hired;
    private Instant fired;

     public UUID getUuid() {
        return uuid;
    }

    /**
     * Set by either the Service or Data layer.
     * @param uuid required non-null
     */
     public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

     public String getFirstName(){
        return firstName;
    }

     public void setFirstName(String name){
        this.name = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String name){
        this.name = lastName;
    }

    public String getFullName(){
        return fullName;
    }

     public void setFullName(String name){
        this.name = fullName;
    }

     public Integer getSalary(){
        return salary;
    }

     public void setSalary(Integer salary){
        this.salary = salary;
    }

     public Integer getAge(){
        return age;
    }

     public void setAge(Integer age){
        this.age = age;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

     public String getEmail(){
        return email;
    }

     public void setEmail(String email){
        this.email = email;
    }

    public Instant getContractHireDate(){
        return hired;
    }

     public void setContractHireDate(Instant date){
        this.date = hired;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
     public Instant getContractTerminationDate(){
        return fired;
    }

     public void setContractTerminationDate(Instant date){
        this.date = fired;
    }
}