package wi;
public final class v {
    public long f58084a = Long.MIN_VALUE;
    public long f58085b = Long.MIN_VALUE;
    public long f58086c = Long.MIN_VALUE;
    public long d;

    public v(long j10) {
        this.d = j10;
    }

    public final long a() {
        long j10 = this.f58086c;
        if (j10 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j10;
    }
}
