package chanh.com.entities;

public enum IsGrant {
    disable(0),
    enable(1);

    private final int value;

    private IsGrant(int value) {
        this.value = value;
    }

    public int getGrantValue() {
        return value;
    }
}
