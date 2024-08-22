package com.untitle.rest.controller;

import com.untitle.rest.aspect.Log;
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

    @Log
    @PostMapping("/signup")
    public ResponseEntity<?> add(@RequestBody Dto.ReqDto dto) {
        return ResponseEntity.ok(service.signup(dto));
    }
    @Log
    @PostMapping("/signsample")
    public ResponseEntity<?> addSample() {
        return ResponseEntity.ok(service.signup());
    }

    @Log
    @GetMapping("/user")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAllList());
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        log.info("{}", id);
        return ResponseEntity.ok().body(service.getOne(id));
    }
}
