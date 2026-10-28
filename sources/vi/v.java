package vi;
public final class v {
    public long f50656a = Long.MIN_VALUE;
    public long f50657b = Long.MIN_VALUE;
    public long f50658c = Long.MIN_VALUE;
    public long d;

    public v(long j10) {
        this.d = j10;
    }

    public final long a() {
        long j10 = this.f50658c;
        if (j10 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j10;
    }
}
