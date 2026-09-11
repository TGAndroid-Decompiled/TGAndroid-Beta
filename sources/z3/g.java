package z3;
public final class g implements Comparable {
    public final long f50689a;
    public final byte[] f50690b;

    public g(long j3, byte[] bArr) {
        this.f50689a = j3;
        this.f50690b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50689a, ((g) obj).f50689a);
    }
}
