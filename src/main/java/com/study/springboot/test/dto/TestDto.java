package com.study.springboot.test.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class TestDto {
    private String name;
    private int age;

}
