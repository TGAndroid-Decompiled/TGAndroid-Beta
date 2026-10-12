package xa;
public enum b implements ma.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final int f48362a;

    b(int i10) {
        this.f48362a = i10;
    }

    @Override
    public final int a() {
        return this.f48362a;
    }
}
