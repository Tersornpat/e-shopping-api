package com.tersornpat.fulldesign.e_shopping_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.math.BigInteger;

@Entity
@Table(schema = "ESHOPPING", name = "TEST_CUSTOMER")
public class TestCustomerEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_customer_id_seq")
    @SequenceGenerator(
            schema = "ESHOPPING",
            name = "test_customer_id_seq",
            sequenceName = "test_customer_id_seq",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FIRSTNAME", length = 100)
    private String firstname;

    @Column(name = "LASTNAME", length = 100)
    private String lastname;

    @Column(name = "TEL", length = 50)
    private String tel;

    @Column(name = "EMAIL", length = 255)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
