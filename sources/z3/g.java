package z3;
public final class g implements Comparable {
    public final long f48361a;
    public final byte[] f48362b;

    public g(long j3, byte[] bArr) {
        this.f48361a = j3;
        this.f48362b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48361a, ((g) obj).f48361a);
    }
}
