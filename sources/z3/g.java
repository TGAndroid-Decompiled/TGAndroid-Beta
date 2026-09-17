package z3;
public final class g implements Comparable {
    public final long f50690a;
    public final byte[] f50691b;

    public g(long j3, byte[] bArr) {
        this.f50690a = j3;
        this.f50691b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50690a, ((g) obj).f50690a);
    }
}
