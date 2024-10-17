package com.skoryk.superapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object responseObject
    ){
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("message", message);
        response.put("httpStatus", httpStatus.value());
        response.put("data", responseObject);

        return new ResponseEntity<>(response, httpStatus);
    }
}
