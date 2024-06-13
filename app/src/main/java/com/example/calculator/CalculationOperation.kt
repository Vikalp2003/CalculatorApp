package com.example.calculator

sealed class CalculationOperation(val symbol : String) {
    object Add : CalculationOperation("+")
    object Substract : CalculationOperation("-")
    object Multiply : CalculationOperation("x")
    object Divide : CalculationOperation("/")
}