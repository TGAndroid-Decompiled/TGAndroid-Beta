package z3;
public final class g implements Comparable {
    public final long f48033a;
    public final byte[] f48034b;

    public g(long j3, byte[] bArr) {
        this.f48033a = j3;
        this.f48034b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48033a, ((g) obj).f48033a);
    }
}
