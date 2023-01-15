package com.example.calculator.service;

import java.util.Objects;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class CalculatorService {
    public int calculate(Operator op, int operand1, int operand2) {
        if (Objects.isNull(op)) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "invalid operator provided");
        }
        return op.calculate(operand1, operand2);
    }
}
