package z3;
public final class g implements Comparable {
    public final long f50688a;
    public final byte[] f50689b;

    public g(long j10, byte[] bArr) {
        this.f50688a = j10;
        this.f50689b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50688a, ((g) obj).f50688a);
    }
}
