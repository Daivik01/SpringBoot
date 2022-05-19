package com.example.SpringBoot1.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@EqualsAndHashCode(callSuper = true)
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@Data
public class Exception  extends RuntimeException{
        private String resourceName;
        private String fieldName;
        private Object fieldValue;

    public Exception(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s is not found with %s: '%s'",resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
