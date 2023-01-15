package com.example.calculator.controller;

import static com.example.calculator.constants.HttpConstants.NUM_1;
import static com.example.calculator.constants.HttpConstants.NUM_2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.Operator;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping({ "/calculator/v1"})
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping ("/add")
    public int addNumbers(
        @RequestParam (value = NUM_1, required = true) int num1,
        @RequestParam (value = NUM_2, required = true) int num2) {
        return calculatorService.calculate(Operator.ADD, num1, num2);
    }

    @GetMapping ("/subtract")
    public int subtractNumbers(
        @RequestParam (value = NUM_1, required = true) int num1,
        @RequestParam (value = NUM_2, required = true) int num2) {
        return calculatorService.calculate(Operator.SUB, num1, num2);
    }

    @GetMapping ("/multiply")
    public int multiplyNumbers(
        @RequestParam (value = NUM_1, required = true) int num1,
        @RequestParam (value = NUM_2, required = true) int num2) {
        return calculatorService.calculate(Operator.MUL, num1, num2);
    }

    @GetMapping ("/divide")
    public int divideNumbers(
        @RequestParam (value = NUM_1, required = true) int num1,
        @RequestParam (value = NUM_2, required = true) int num2) {
        return calculatorService.calculate(Operator.DIV, num1, num2);
    }
}
