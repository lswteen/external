package com.renzo.external.web.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
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
    private List<String> infoList = new ArrayList<>();

    private LocalDate regDate;
}
