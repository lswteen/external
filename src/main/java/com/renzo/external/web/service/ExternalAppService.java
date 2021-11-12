package com.renzo.external.web.service;

import com.renzo.external.web.dto.DummyData;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class ExternalAppService {
private final static String URL = "https://my-json-server.typicode.com/typicode/demo/posts";

    public List<DummyData> execution(){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json");
        HttpEntity<DummyData> entity = new HttpEntity<>(headers);

        ResponseEntity<List<DummyData>> responseEntity =
        restTemplate.exchange(URL, HttpMethod.GET, entity, new ParameterizedTypeReference<List<DummyData>>() {});

        log.info(String.valueOf(responseEntity.getStatusCode()));
        log.info(String.valueOf(responseEntity.getBody()));
        log.info(responseEntity.toString());

        return responseEntity.getBody();
    }
}
