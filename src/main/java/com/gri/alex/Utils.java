package com.gri.alex;

import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class Utils {

    public static HttpHeaders generateHttpHeaders(Long resourceId) {
        HttpHeaders responseHeaders = new HttpHeaders();

        URI newPollUri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(resourceId)
                .toUri();

        responseHeaders.setLocation(newPollUri);

        return responseHeaders;
    }
}
