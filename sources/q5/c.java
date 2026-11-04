package q5;
public enum c implements pa.b {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int f53801a;

    c(int i3) {
        this.f53801a = i3;
    }

    @Override
    public final int a() {
        return this.f53801a;
    }
}
