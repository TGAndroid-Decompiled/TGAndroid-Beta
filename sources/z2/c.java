package z2;
public enum c implements t9.b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int f50278a;

    c(int i9) {
        this.f50278a = i9;
    }

    @Override
    public final int a() {
        return this.f50278a;
    }
}
