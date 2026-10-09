package z3;
public final class g implements Comparable {
    public final long f53495a;
    public final byte[] f53496b;

    public g(long j3, byte[] bArr) {
        this.f53495a = j3;
        this.f53496b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53495a, ((g) obj).f53495a);
    }
}
