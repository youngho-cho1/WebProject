package com.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class MemberDto {
    String id;
    String name;
    String password;
    String email;
    String tell;
    String zipcode;

}
