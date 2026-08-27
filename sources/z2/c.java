package z2;

public enum c implements u9.b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    public final int f50178a;

    c(int i10) {
        this.f50178a = i10;
    }

    @Override
    public final int a() {
        return this.f50178a;
    }
}
