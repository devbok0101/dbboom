package com.show.db.cpu.increase.dbboom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "large_table")
public class LargeTable {

    @Id
    private Long id;

    private String columnName;
    private String dataType;
    private String isNullable;

    // getters and setters
}