package z3;
public final class g implements Comparable {
    public final long f52389a;
    public final byte[] f52390b;

    public g(long j3, byte[] bArr) {
        this.f52389a = j3;
        this.f52390b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52389a, ((g) obj).f52389a);
    }
}
