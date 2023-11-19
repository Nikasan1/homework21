package Helper;

public enum Drinks {
    COFFEE(25, 0),
    TEA(25, 0),
    LEMONADE(30, 0),
    MOJITO(35, 0),
    WATER(15, 0),
    COLA(27, 0);

    private final int price;
    private int count;

    Drinks(int price, int count) {
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
