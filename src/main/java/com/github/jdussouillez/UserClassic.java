package com.github.jdussouillez;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class UserClassic {

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected int id;

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected String name;
}
