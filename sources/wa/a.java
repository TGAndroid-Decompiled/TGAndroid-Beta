package wa;
public enum a implements la.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    public final int f48463a;

    a(int i10) {
        this.f48463a = i10;
    }

    @Override
    public final int a() {
        return this.f48463a;
    }
}
