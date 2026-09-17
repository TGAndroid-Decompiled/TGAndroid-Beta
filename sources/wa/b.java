package wa;
public enum b implements la.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final int f48466a;

    b(int i10) {
        this.f48466a = i10;
    }

    @Override
    public final int a() {
        return this.f48466a;
    }
}
