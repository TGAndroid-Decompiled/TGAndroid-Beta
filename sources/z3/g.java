package z3;
public final class g implements Comparable {
    public final long f50718a;
    public final byte[] f50719b;

    public g(long j3, byte[] bArr) {
        this.f50718a = j3;
        this.f50719b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50718a, ((g) obj).f50718a);
    }
}
