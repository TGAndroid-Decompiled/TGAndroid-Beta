package z3;
public final class g implements Comparable {
    public final long f54559a;
    public final byte[] f54560b;

    public g(long j10, byte[] bArr) {
        this.f54559a = j10;
        this.f54560b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f54559a, ((g) obj).f54559a);
    }
}
