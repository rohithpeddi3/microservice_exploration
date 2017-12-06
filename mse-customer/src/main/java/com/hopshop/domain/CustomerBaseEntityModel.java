package com.hopshop.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by rohith on 22/11/17.
 */
@Data
@MappedSuperclass
public abstract class CustomerBaseEntityModel implements Serializable{

    @Column(name = "created_tstamp", updatable = false)
    private LocalDateTime created;

    @Column(name = "last_updated_tstamp")
    private LocalDateTime lastUpdated;

    @Column(name = "deleted_tstamp")
    private LocalDateTime deleted;

    @Column(name = "created_by_id", nullable = false)
    private Long createdById;

    @Column(name = "last_updated_by_id", nullable = false)
    private Long lastUpdatedById;

    @Column(name = "deleted_by_id")
    private Long deletedById;

    public CustomerBaseEntityModel() {
        onCreate();
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
        this.lastUpdatedById = createdById;
    }

    @PrePersist
    public void onCreate() {
        created = LocalDateTime.now();
        lastUpdated = LocalDateTime.now();
    }

    public void onCreate(Long userId){
        onCreate();
        createdById = userId;
        lastUpdatedById = userId;
    }

    @PreUpdate
    public void onUpdate() {
        lastUpdated = LocalDateTime.now();
    }

    public void onUpdate(Long userId) {
        onUpdate();
        lastUpdatedById = userId;
    }

    public void onDelete() {
        deleted = LocalDateTime.now();
        lastUpdated = LocalDateTime.now();
    }

    public void onDelete(Long userId) {
        onDelete();
        lastUpdatedById = userId;
        deletedById = userId;
    }

}
