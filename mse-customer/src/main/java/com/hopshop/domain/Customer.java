package com.hopshop.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by rohith on 22/11/17.
 */
@Entity
@Data
@EqualsAndHashCode(of={"id"}, callSuper = false)
@Table(name = "customer")
public class Customer extends CustomerBaseEntityModel{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 200, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 200, nullable = false)
    private String lastName;

    @Column(name = "address", length = 200)
    private String address;

}
