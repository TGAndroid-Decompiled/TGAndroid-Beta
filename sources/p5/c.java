package p5;
public enum c implements na.b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int f46803a;

    c(int i10) {
        this.f46803a = i10;
    }

    @Override
    public final int a() {
        return this.f46803a;
    }
}
