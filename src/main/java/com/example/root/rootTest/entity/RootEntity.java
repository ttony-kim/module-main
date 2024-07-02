package com.example.root.rootTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_root_entity")
public class RootEntity {

    @Id
    private Long id;

    private String rootName;

    private String rootData;
}
