abstract class Money {
    protected int amount;
    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
}

class Dollar extends Money {
    Dollar(int amount) {
        super(amount);
    }

    @Override
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

class Franc extends Money {
    Franc(int amount) {
        super(amount);
    }

    @Override
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
