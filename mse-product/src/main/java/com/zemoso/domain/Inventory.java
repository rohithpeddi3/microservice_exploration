package com.zemoso.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by varun on 22/11/17.
 */
@Entity
@Data
@EqualsAndHashCode(of={"id"}, callSuper = false)
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    @Column(name = "id")
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "quantity")
    private Long quantity;
}
