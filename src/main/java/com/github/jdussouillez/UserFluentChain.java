package com.github.jdussouillez;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(fluent = true, chain = true)
@ToString
public class UserFluentChain {

    @Getter
    @Setter
    @JsonProperty(required = true)
    protected int id;

    @Getter
    @Setter(onMethod_ = {@MyCustomAnnotation})
    @JsonProperty(required = true)
    protected String name;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyCustomAnnotation {
    }
}
