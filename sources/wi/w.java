package wi;
public final class w {
    public long f58235a = Long.MIN_VALUE;
    public long f58236b = Long.MIN_VALUE;
    public long f58237c = Long.MIN_VALUE;
    public long d;

    public w(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f58237c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
