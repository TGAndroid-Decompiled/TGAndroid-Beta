package z3;
public final class g implements Comparable {
    public final long f48087a;
    public final byte[] f48088b;

    public g(long j3, byte[] bArr) {
        this.f48087a = j3;
        this.f48088b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48087a, ((g) obj).f48087a);
    }
}
