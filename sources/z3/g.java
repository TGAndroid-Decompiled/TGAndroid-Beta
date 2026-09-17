package z3;
public final class g implements Comparable {
    public final long f48110a;
    public final byte[] f48111b;

    public g(long j3, byte[] bArr) {
        this.f48110a = j3;
        this.f48111b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48110a, ((g) obj).f48110a);
    }
}
