package com.untitle.rest.service;

import com.untitle.rest.dto.Dto;
import com.untitle.rest.entity.User;
import com.untitle.rest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestService {
    @Autowired
    private TestRepository repository;

    /*
    public Dto.RespDto add(Dto.ReqDto reqDto) {

        return Dto.RespDto.builder()
                .message("성공")
                .data(repository.save(reqDto.toEntity()))
                .build();
    }
     */
    public User signup() {
        for (int i = 0; i < 100; i++) {
            repository.save(
                    User.builder()
                            .username("id" + i)
                            .password("1234")
                            .username("김결휘양산" + i)
                            .build()
            );
        }
        User user = null;

        return user;
    }

    public User signup(Dto.ReqDto dto) {
        return repository.save(dto.toEntity());
    }

    public List<Dto.RespDto> getAllList() {
        return repository.findAll().stream().map(User::toDto).collect(Collectors.toList());
    }
    public Dto.RespDto getOne(Long id) {
        return repository.findById(id).get().toDto();
    }
}