package com.untitle.rest.dto;

import com.untitle.rest.entity.User;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

public class Dto {

    @Data
    public static class ReqDto {
        private String username;
        private String password;
        private String name;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .name(name)
                    .build();
        }
    }

    @Data
    @Builder
    public static class RespDto <T> {
        private Long id;
        private String username;
        private String password;
        private String name;
    }

}
