package wi;
public final class w {
    public long f58245a = Long.MIN_VALUE;
    public long f58246b = Long.MIN_VALUE;
    public long f58247c = Long.MIN_VALUE;
    public long d;

    public w(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f58247c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
