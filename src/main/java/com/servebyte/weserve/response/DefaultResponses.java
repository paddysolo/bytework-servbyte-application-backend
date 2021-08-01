
package com.servebyte.weserve.response;

import org.springframework.http.HttpStatus;

public class DefaultResponses {
    
    public static <E> ApiResponse response200(String message, E object) {
        return new ApiResponse(true, HttpStatus.OK.value(), message, object);
    }

    public static ApiResponse response200(String message) {
        return new ApiResponse(true, HttpStatus.OK.value(), message);
    }
    public static ApiResponse response400(String message) {
        return new ApiResponse(false, HttpStatus.BAD_REQUEST.value(), message);
    }

    public static ApiResponse response500(String message) {
        return new ApiResponse(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

}
