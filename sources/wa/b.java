package wa;
public enum b implements la.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final int f49020a;

    b(int i10) {
        this.f49020a = i10;
    }

    @Override
    public final int a() {
        return this.f49020a;
    }
}
