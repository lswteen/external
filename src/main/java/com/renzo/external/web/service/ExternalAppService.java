package com.renzo.external.web.service;

import com.renzo.external.web.request.ExternalRequest;
import com.renzo.external.web.response.ExternalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExternalAppService {

    public ResponseEntity<ExternalResponse> execution(ExternalRequest externalRequest){
        return null;
    }
}
