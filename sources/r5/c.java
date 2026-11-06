package r5;
public enum c implements qa.b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int f54320a;

    c(int i7) {
        this.f54320a = i7;
    }

    @Override
    public final int a() {
        return this.f54320a;
    }
}
