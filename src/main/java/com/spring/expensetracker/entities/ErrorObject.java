package com.spring.expensetracker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorObject {
    private Integer statusCode;
    private String message;
    private Date timeStamp;
}
