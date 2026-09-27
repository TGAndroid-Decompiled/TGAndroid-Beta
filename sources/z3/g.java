package z3;
public final class g implements Comparable {
    public final long f48404a;
    public final byte[] f48405b;

    public g(long j3, byte[] bArr) {
        this.f48404a = j3;
        this.f48405b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48404a, ((g) obj).f48404a);
    }
}
