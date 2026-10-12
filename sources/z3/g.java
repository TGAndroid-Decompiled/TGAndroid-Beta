package z3;
public final class g implements Comparable {
    public final long f53719a;
    public final byte[] f53720b;

    public g(long j3, byte[] bArr) {
        this.f53719a = j3;
        this.f53720b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53719a, ((g) obj).f53719a);
    }
}
