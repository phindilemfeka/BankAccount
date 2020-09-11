package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private String name;
    private String surname;
    private long idNumber;
    private UUID accountNumber;

    public User(@JsonProperty("name") String name, @JsonProperty("surname") String surname,@JsonProperty("idNumber") long idNumber,
                @JsonProperty("accountNumber") UUID accountNumber){
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.accountNumber = accountNumber;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
}
