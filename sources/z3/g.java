package z3;
public final class g implements Comparable {
    public final long f50648a;
    public final byte[] f50649b;

    public g(long j10, byte[] bArr) {
        this.f50648a = j10;
        this.f50649b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50648a, ((g) obj).f50648a);
    }
}
