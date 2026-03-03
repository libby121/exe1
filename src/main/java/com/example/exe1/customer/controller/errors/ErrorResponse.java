package com.example.exe1.customer.controller.errors;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ErrorResponse {

    private HttpStatus status;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMdd hh:mm:ss")
    private LocalDateTime time;
    private String message;

    public ErrorResponse(HttpStatus status,String msg) {
        this.status= status;
        this.message=msg;
        this.time=LocalDateTime.now();
    }
}
