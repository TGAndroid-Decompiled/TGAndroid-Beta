package xa;
public enum a implements ma.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    public final int f50195a;

    a(int i10) {
        this.f50195a = i10;
    }

    @Override
    public final int a() {
        return this.f50195a;
    }
}
