package com.renzo.external.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DummyDataList {
    private List<DummyData> dummyDataList = new ArrayList<>();
}
