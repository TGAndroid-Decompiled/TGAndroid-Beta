package z3;
public final class g implements Comparable {
    public final long f48360a;
    public final byte[] f48361b;

    public g(long j3, byte[] bArr) {
        this.f48360a = j3;
        this.f48361b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48360a, ((g) obj).f48360a);
    }
}
