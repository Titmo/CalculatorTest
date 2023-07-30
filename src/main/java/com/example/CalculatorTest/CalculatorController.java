package com.example.CalculatorTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServes calculatorServes;
    public CalculatorController(CalculatorServes calculatorServes) {
        this.calculatorServes = calculatorServes;
    }
    @GetMapping
    public String hello() {
        return calculatorServes.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.divide(num1,num2);
    }

}
