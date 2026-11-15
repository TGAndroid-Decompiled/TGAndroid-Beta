package zi;
public final class x {
    public long f61776a = Long.MIN_VALUE;
    public long f61777b = Long.MIN_VALUE;
    public long f61778c = Long.MIN_VALUE;
    public long d;

    public x(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f61778c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
