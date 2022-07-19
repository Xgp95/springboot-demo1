package com.springboot.springbootdemo1.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: Xugp
 * @date: 2022/5/17 16:43
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Component
@ConfigurationProperties(prefix = "tompet")
public class Pet {
    private String petName;
    private double weight;
}
