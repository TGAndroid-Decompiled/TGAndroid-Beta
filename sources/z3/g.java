package z3;
public final class g implements Comparable {
    public final long f48341a;
    public final byte[] f48342b;

    public g(long j3, byte[] bArr) {
        this.f48341a = j3;
        this.f48342b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48341a, ((g) obj).f48341a);
    }
}
