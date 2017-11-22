package com.zemoso.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 22/11/17.
 */
@Entity
@Data
@EqualsAndHashCode(of={"id"}, callSuper = false)
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Type(type = "json")
    @Column(name = "product_details", columnDefinition = "json")
    private List<Map> productDetails;

}
