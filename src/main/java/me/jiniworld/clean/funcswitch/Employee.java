package me.jiniworld.clean.funcswitch;

public interface Employee {
    abstract boolean isPayday();
    abstract Money calculatePay();
    abstract void deliverPay(Money money);
}

class Money {

}