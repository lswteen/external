package com.renzo.external.web.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExternalRequest {

    private Long id;

    private String name;

    private int age;

    @Builder.Default
    private List<Info> infos = new ArrayList<>();

    private Date regDate;



    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Info{
        private int weight;
        private int height;
    }
}
