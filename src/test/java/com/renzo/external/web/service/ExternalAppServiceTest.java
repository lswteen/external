package com.renzo.external.web.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.renzo.external.web.request.ExternalRequest;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExternalAppServiceTest {
    @BeforeTestClass
    void beforeTestClass(){
        System.out.println(3);
    }


    void setup(){
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(1);
    }

    void after(){
        System.out.println(2);
    }

    @Test
    void objectToJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<ExternalRequest.Info> infos = new ArrayList<>();
        infos.add(ExternalRequest.Info.builder()
                .weight(80)
                .height(181)
                .build());

        objectMapper.writeValue(new File("/Users/lswteen/workspace/external/src/main/resources/static/requert.json"),ExternalRequest.builder()
                .id(100L)
                .name("renzo")
                .age(42)
                .infos(infos)
                .regDate(Date.valueOf(LocalDate.now()))
                .build());

    }


    @Test
    void writeValueAsString() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<ExternalRequest.Info> infos = new ArrayList<>();
        infos.add(ExternalRequest.Info.builder()
                .weight(80)
                .height(181)
                .build());

        String result = objectMapper.writeValueAsString(ExternalRequest.builder()
                .id(100L)
                .name("renzo")
                .age(42)
                .infos(infos)
                .regDate(Date.valueOf(LocalDate.now()))
                .build());
        System.out.println(result);
    }

    @Test
    void JsonTOObject() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ExternalRequest externalRequest = objectMapper.readValue(new File("C:\\workspace\\external\\src\\main\\resources\\static\\requert.json"),ExternalRequest.class);
        System.out.println(externalRequest.toString());
    }
}