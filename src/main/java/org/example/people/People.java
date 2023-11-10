package org.example.people;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class People {
    @Getter
    private String name;
}
