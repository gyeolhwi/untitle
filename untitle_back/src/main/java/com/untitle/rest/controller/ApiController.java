package com.untitle.rest.controller;

import com.untitle.rest.dto.Dto;
import com.untitle.rest.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
public class ApiController {

    @Autowired
    private TestService service;

    @PostMapping("/signup")
    public ResponseEntity<?> add(@RequestBody Dto.ReqDto dto) {
        log.info("{}", dto);
        return ResponseEntity.ok(service.signup(dto));
    }
    @PostMapping("/signsample")
    public ResponseEntity<?> addSample() {
        return ResponseEntity.ok(service.signup());
    }
    @GetMapping("/user")
    public ResponseEntity<?> getAll() {
        System.out.println("호출");
        return ResponseEntity.ok(service.getAllList());
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        log.info("{}", id);
        return ResponseEntity.ok().body(service.getOne(id));
    }
}
