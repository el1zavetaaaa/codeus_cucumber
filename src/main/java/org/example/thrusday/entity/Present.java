package org.example.thrusday.entity;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class Present {
    private String name;
    private String description;
}