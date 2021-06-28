package com.example.environment_available.services;

import com.example.environment_available.constants.EnvType;
import com.example.environment_available.constants.MsType;
import com.example.environment_available.dtos.AvailableEnvironment;
import com.example.environment_available.dtos.Env;
import com.example.environment_available.dtos.ResultGit;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

@Component
public class AvailableServiceImpl implements AvailableService {

    @Override
    public AvailableEnvironment getAvailableEnv() {
        List<Env> envList = new ArrayList<>();

        Set<MsType> msTypeDev = EnumSet.allOf(MsType.class);
        for(MsType mstype : msTypeDev) {
            envList.add(getEnv(EnvType.DEV.getDescription(), mstype.getDescription()));
        }

        Set<MsType> msTypeUat = EnumSet.allOf(MsType.class);
        for(MsType mstype : msTypeUat) {
            envList.add(getEnv(EnvType.UAT.getDescription(), mstype.getDescription()));
        }

        AvailableEnvironment av = new AvailableEnvironment();
        av.setEnvList(envList);
        return av;
    }

    private Env getEnv(String env, String ms) {
        RestTemplate restTemplate = new RestTemplate();
        Env envi = new Env();

        String url = "http://api.k8s." + env + ".pontoslivelo.com.br/" + ms + "/actuator/info";

        ResultGit result = restTemplate.getForObject(url, ResultGit.class);
        envi.setMicroService(ms);
        envi.setTypeEnv(env);
        envi.setGit(result.getGit());

        return envi;

    }
}
