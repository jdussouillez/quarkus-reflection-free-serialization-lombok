package com.github.jdussouillez;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(fluent = true, chain = false)
@ToString
public class UserFluent {

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected int id;

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected String name;
}
