package com.brayanrondonh.family.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Family implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idFamily;
    private String firstName;
    private String lastname;
    private String typeDocument;
    private String dni;
    private LocalDate birthdate;
    private String phoneNumber;
    private String email;

    public Family(){}

    public Family(long idFamily, String firstName, String lastname, String typeDocument, String dni, LocalDate birthdate, String phoneNumber, String email)
    {
        this.idFamily = idFamily;
        this.firstName = firstName;
        this.lastname = lastname;
        this.typeDocument = typeDocument;
        this.dni = dni;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getIdFamily()
    {
        return idFamily;
    }

    public void setIdFamily(long idFamily)
    {
        this.idFamily = idFamily;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getTypeDocument()
    {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument)
    {
        this.typeDocument = typeDocument;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public LocalDate getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "family{idFamily=" + idFamily + ", firstName='" + firstName + '\'' + ", lastname='" + lastname + '\'' + ", typeDocument='" + typeDocument + '\'' + ", dni='" + dni + '\'' + ", birthdate=" + birthdate + ", phoneNumber='" + phoneNumber + '\'' + ", email='" + email + '\'' + '}';
    }
}