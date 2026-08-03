package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

/**
 * Every abstraction of an Employee should, at the bare minimum, implement this interface. Consider this a binding
 * contract for the domain model of an Employee.
 */
public interface Employee {

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

    UUID getUuid() {
        return uuid;
    }

    /**
     * Set by either the Service or Data layer.
     * @param uuid required non-null
     */
    void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    String getFirstName(){
        return firstName;
    }

    void setFirstName(String name){
        this.name = firstName;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String name){
        this.name = lastName;
    }

    String getFullName(){
        return fullName;
    }

    void setFullName(String name){
        this.name = fullName;
    }

    Integer getSalary(){
        return salary;
    }

    void setSalary(Integer salary){
        this.salary = salary;
    }

    Integer getAge(){
        return age;
    }

    void setAge(Integer age){
        this.age = age;
    }

    String getJobTitle(){
        return jobTitle;
    }

    void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    String getEmail(){
        return email;
    }

    void setEmail(String email){
        this.email = email;
    }

    Instant getContractHireDate(){
        return hired;
    }

    void setContractHireDate(Instant date){
        this.date = hired;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
    Instant getContractTerminationDate(){
        return fired;
    }

    void setContractTerminationDate(Instant date){
        this.date = fired;
    }
}
