package com.zemoso.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by varun on 22/11/17.
 */
@Entity
@Data
@EqualsAndHashCode(of={"id"}, callSuper = false)
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_name", length = 200, nullable = false)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Long categoryId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", nullable = false)
    private Long brandId;

    @Column(name = "price")
    private float price;

    @Column(name = "mfg_date")
    private LocalDateTime mfgDate;
}
