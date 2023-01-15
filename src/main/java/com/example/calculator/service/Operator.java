package com.example.calculator.service;

public enum Operator {
    ADD {
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUB {
        @Override
        public int calculate(int num1, int num2) {
            return num1 - num2;
        }
    },
    MUL {
        @Override
        public int calculate(int num1, int num2) {
            return num1 * num2;
        }
    },
    DIV {
        @Override
        public int calculate(int num1, int num2) {
            return num1 / num2;
        }
    };

    public abstract int calculate(int num1, int num2);
}