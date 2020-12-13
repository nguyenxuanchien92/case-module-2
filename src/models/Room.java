package models;

public class Room {
    private Customer customer;
    private String roomId;
    private boolean isRent;
    private String dayOfRent;
    private TypeRoom typeRoom;
    private long priceRoom;

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public long getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(long priceRoom) {
        this.priceRoom = priceRoom;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isRent() {
        return isRent;
    }

    public void setRent(boolean rent) {
        isRent = rent;
    }

    public String getDayOfRent() {
        return dayOfRent;
    }

    public void setDayOfRent(String dayOfRent) {
        this.dayOfRent = dayOfRent;
    }
}
