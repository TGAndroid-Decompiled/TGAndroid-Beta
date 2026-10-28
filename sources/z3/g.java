package z3;
public final class g implements Comparable {
    public final long f52707a;
    public final byte[] f52708b;

    public g(long j10, byte[] bArr) {
        this.f52707a = j10;
        this.f52708b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52707a, ((g) obj).f52707a);
    }
}
