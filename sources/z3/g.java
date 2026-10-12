package z3;
public final class g implements Comparable {
    public final long f53727a;
    public final byte[] f53728b;

    public g(long j3, byte[] bArr) {
        this.f53727a = j3;
        this.f53728b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53727a, ((g) obj).f53727a);
    }
}
