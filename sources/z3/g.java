package z3;
public final class g implements Comparable {
    public final long f54577a;
    public final byte[] f54578b;

    public g(long j10, byte[] bArr) {
        this.f54577a = j10;
        this.f54578b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f54577a, ((g) obj).f54577a);
    }
}
