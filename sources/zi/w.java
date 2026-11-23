package zi;
public final class w {
    public long f62471a = Long.MIN_VALUE;
    public long f62472b = Long.MIN_VALUE;
    public long f62473c = Long.MIN_VALUE;
    public long d;

    public w(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f62473c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
