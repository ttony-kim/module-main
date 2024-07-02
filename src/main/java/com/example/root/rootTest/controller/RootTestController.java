package com.example.root.rootTest.controller;

import com.example.root.rootTest.entity.RootEntity;
import com.example.root.rootTest.repository.RootEntityRepository;
import com.example.root.rootTest.repository.RootEntityRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootTestController {

    @Autowired
    private RootEntityRepository rootEntityRepository;

    @Autowired
    private RootEntityRepository2 rootEntityRepository2;

    @GetMapping("/api/root/test")
    public String test() {

        return "root controller test";
    }

    @GetMapping("/api/root/test/repository")
    public String test2() {
        RootEntity name = rootEntityRepository.findByRootName("name");
        RootEntity data = rootEntityRepository2.findByRootData("data");

        return "root repository test";
    }

}
