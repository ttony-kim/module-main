package com.example.root.rootTest.repository;

import com.example.root.rootTest.entity.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RootEntityRepository2 extends JpaRepository<RootEntity, Long> {

    RootEntity findByRootData(String rootData);

}
