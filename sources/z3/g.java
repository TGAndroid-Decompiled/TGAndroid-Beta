package z3;
public final class g implements Comparable {
    public final long f48363a;
    public final byte[] f48364b;

    public g(long j3, byte[] bArr) {
        this.f48363a = j3;
        this.f48364b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48363a, ((g) obj).f48363a);
    }
}
