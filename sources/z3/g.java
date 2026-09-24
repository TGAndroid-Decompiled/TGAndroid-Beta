package z3;
public final class g implements Comparable {
    public final long f48350a;
    public final byte[] f48351b;

    public g(long j3, byte[] bArr) {
        this.f48350a = j3;
        this.f48351b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48350a, ((g) obj).f48350a);
    }
}
