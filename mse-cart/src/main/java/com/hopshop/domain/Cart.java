package com.hopshop.domain;

import com.hopshop.enums.CartStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by rohith on 22/11/17.
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode(of={"id"}, callSuper = false)
@Table(name = "cart")
public class Cart extends CartBaseEntityModel{

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

    @Enumerated
    @Column(name = "cart_status")
    private CartStatus cartStatus;

}
