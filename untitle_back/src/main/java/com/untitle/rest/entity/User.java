package com.untitle.rest.entity;

import com.untitle.rest.dto.Dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@Builder
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = true)
    private String password;
    @ColumnDefault("'name'")
    private String name;

    public Dto.RespDto toDto() {
        return Dto.RespDto.builder()
                .id(id)
                .username(username)
                .password(password)
                .name(name)
                .build();
    }



}
