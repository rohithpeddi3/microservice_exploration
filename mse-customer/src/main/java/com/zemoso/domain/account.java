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
@Table(name = "account")
public class account {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    @Column(name = "id")
    private Long id;

    @Column(name = "account_no")
    private Long accountNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "current_balance")
    private Long currentBalance;
}
