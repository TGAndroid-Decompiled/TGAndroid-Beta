package z3;
public final class g implements Comparable {
    public final long f53616a;
    public final byte[] f53617b;

    public g(long j3, byte[] bArr) {
        this.f53616a = j3;
        this.f53617b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53616a, ((g) obj).f53616a);
    }
}
