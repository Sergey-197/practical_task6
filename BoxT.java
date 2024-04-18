class Box<T extends Cat> {
    private T guest;

    public Box(T guest) {
        this.guest = guest;
    }

    public void saySomething() {
        guest.voice();
    }

    public T getGuest() {
        return guest;
    }

    public void setGuest(T guest) {
        this.guest = guest;
    }
}
