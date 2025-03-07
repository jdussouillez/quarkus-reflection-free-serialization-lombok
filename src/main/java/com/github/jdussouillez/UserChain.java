package com.github.jdussouillez;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@ToString
public class UserChain {

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected int id;

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected String name;
}
