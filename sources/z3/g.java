package z3;
public final class g implements Comparable {
    public final long f51111a;
    public final byte[] f51112b;

    public g(long j10, byte[] bArr) {
        this.f51111a = j10;
        this.f51112b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f51111a, ((g) obj).f51111a);
    }
}
