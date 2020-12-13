package models;

public enum TypeRoom {
    VIP(20000), ECONOMY(50000);

    private int value;

    TypeRoom(int value) {
        this.value = value;
    }
}
