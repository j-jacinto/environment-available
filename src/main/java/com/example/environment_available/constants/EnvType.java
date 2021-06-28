package com.example.environment_available.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnvType {
    UAT("uat"),
    DEV("dev");

    private String description;
}
