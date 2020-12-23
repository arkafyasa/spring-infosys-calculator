/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arka.infosysCalculator;

import com.arka.infosysCalculator.model.ResultNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arkaf
 */
@RestController
public class CalculatorController {
    ResultNumber resultNumber;
    @GetMapping("/tambah/{a}/{b}")
    public ResultNumber tambah(@PathVariable int a, @PathVariable int b){
        resultNumber = new ResultNumber();
        resultNumber.setResult(a + b);
        return resultNumber;
    }
    @GetMapping("/kurang/{a}/{b}")
    public ResultNumber kurang(@PathVariable int a, @PathVariable int b){
        resultNumber = new ResultNumber();
        resultNumber.setResult(a - b);
        return resultNumber;
    }
    @GetMapping("/kali/{a}/{b}")
    public ResultNumber kali(@PathVariable int a, @PathVariable int b){
        resultNumber = new ResultNumber();
        resultNumber.setResult(a * b);
        return resultNumber;
    }
    @GetMapping("/bagi/{a}/{b}")
    public ResultNumber bagi(@PathVariable int a, @PathVariable int b){
        resultNumber = new ResultNumber();
        resultNumber.setResult(a / b);
        return resultNumber;
    }
}
