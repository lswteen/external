package com.renzo.external.web;

import com.renzo.external.web.dto.DummyData;

import com.renzo.external.web.service.ExternalAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class ExternalAppController {
    private final ExternalAppService externalAppService;

    @GetMapping("/dummys")
    @ResponseBody
    public List<DummyData> getDummys(){
        return externalAppService.execution();
    }
}
