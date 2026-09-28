package z3;
public final class g implements Comparable {
    public final long f48362a;
    public final byte[] f48363b;

    public g(long j3, byte[] bArr) {
        this.f48362a = j3;
        this.f48363b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48362a, ((g) obj).f48362a);
    }
}
