# quarkus-reflection-free-serialization-lombok

Project to demonstrate the usage of Lombok fluent/chain accessors and Quarkus reflection-free Jackson serialization.

See https://github.com/quarkusio/quarkus/issues/46647

## How to build

```sh
# Pass
./mvnw clean package

# Fail because of "fluent" setters
./mvnw clean package -Dquarkus.rest.jackson.optimization.enable-reflection-free-serializers=true
```
