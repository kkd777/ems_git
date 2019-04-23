package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    @Id
    private String id;

    private String name;

    private String sex;

    private Integer age;

    private Date bir;

    private Double salary;


}