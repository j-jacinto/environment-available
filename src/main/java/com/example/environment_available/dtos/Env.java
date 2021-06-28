package com.example.environment_available.dtos;

import java.util.List;

public class Env {
    private String typeEnv;
    private String microService;
    private Git git;

    public String getTypeEnv() {
        return typeEnv;
    }

    public void setTypeEnv(String typeEnv) {
        this.typeEnv = typeEnv;
    }

    public String getMicroService() {
        return microService;
    }

    public void setMicroService(String microService) {
        this.microService = microService;
    }

    public Git getGit() {
        return git;
    }

    public void setGit(Git git) {
        this.git = git;
    }
}
