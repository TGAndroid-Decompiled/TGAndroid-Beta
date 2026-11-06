package wi;
public final class w {
    public long f58141a = Long.MIN_VALUE;
    public long f58142b = Long.MIN_VALUE;
    public long f58143c = Long.MIN_VALUE;
    public long d;

    public w(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f58143c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
