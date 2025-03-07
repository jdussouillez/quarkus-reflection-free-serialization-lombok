package com.github.jdussouillez;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.arc.All;
import io.quarkus.jackson.ObjectMapperCustomizer;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;
import java.util.List;

public class CustomObjectMapper {

    @Singleton
    @Produces
    protected ObjectMapper get(@All final List<ObjectMapperCustomizer> customizers) {
        var mapper = new ObjectMapper();
        for (var customizer : customizers) {
            customizer.customize(mapper);
        }
        return mapper;
    }
}
