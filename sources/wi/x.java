package wi;
public final class x {
    public long f58146a = Long.MIN_VALUE;
    public long f58147b = Long.MIN_VALUE;
    public long f58148c = Long.MIN_VALUE;
    public long d;

    public x(long j3) {
        this.d = j3;
    }

    public final long a() {
        long j3 = this.f58148c;
        if (j3 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j3;
    }
}
