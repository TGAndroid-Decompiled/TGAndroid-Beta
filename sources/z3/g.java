package z3;
public final class g implements Comparable {
    public final long f50719a;
    public final byte[] f50720b;

    public g(long j3, byte[] bArr) {
        this.f50719a = j3;
        this.f50720b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50719a, ((g) obj).f50719a);
    }
}
