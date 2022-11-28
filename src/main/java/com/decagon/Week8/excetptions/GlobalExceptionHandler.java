package com.decagon.Week8.excetptions;

import com.decagon.Week8.pojos.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponse<String> handleNotFoundException(NotFoundException ex){
        return  new ApiResponse<>(ex.getMessage(), HttpStatus.NOT_FOUND.value(), null);
    }

    @ExceptionHandler(AlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public ApiResponse<String> handleAlreadyExistException(AlreadyExistException ex){
        return  new ApiResponse<>(ex.getMessage(), HttpStatus.CONFLICT.value(), null);
    }
}
