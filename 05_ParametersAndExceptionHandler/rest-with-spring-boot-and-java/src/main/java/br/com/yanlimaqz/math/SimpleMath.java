package br.com.yanlimaqz.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo){
        return numberOne / numberTwo;
    }

    public Double mul(Double numberOne, Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double mean(Double numberOne, Double numberTwo){
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(Double number){
        return Math.sqrt(number);
    }
}
