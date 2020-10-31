package com.company;

public class Num {
    int modulo, value;
    Num(int value, int modulo){
        this.modulo = modulo;
        if (modulo != 0){
            if (value > 0){
                this.value = value % modulo;
            }
            else{
                this.value = modulo + value % modulo;
            }
        }
        else {
            this.value = value;
        }
    }
    Num(Num num){
//        this.value = num.value;
//        this.modulo = 0;
        this(num.getValue(), num.getModulo());
    }
    Num plus(Num rhs){
        return new Num(value + rhs.value, Math.max(modulo, rhs.modulo));
    }
    Num plus(int rhs){
        return new Num(value + rhs, modulo);
    }
    Num minus(Num rhs){
        return new Num( value - rhs.value, Math.max(modulo, rhs.modulo));
    }
    Num minus(int rhs){
        return new Num(value - rhs, modulo);
    }
    Num mult(Num rhs){
        return new Num(value * rhs.value, Math.max(modulo, rhs.modulo));
    }
    Num mult(int rhs){
        return new Num(value * rhs, modulo);
    }
    int getModulo(){
        return modulo;
    }
    int getValue(){
        return value;
    }
}
