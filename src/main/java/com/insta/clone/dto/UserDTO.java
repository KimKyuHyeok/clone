package com.insta.clone.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class UserDTO {
    private int userId;
    private String username;
    private String password;
    private String website;
    private String bio;
    private String name;
    private String email;
    private String phone;
    private String gender;

    private String profileImage;

    private String provider;

    private String role;

    private LocalDateTime createDate;
}
