package z3;
public final class g implements Comparable {
    public final long f51110a;
    public final byte[] f51111b;

    public g(long j10, byte[] bArr) {
        this.f51110a = j10;
        this.f51111b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f51110a, ((g) obj).f51110a);
    }
}
