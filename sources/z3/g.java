package z3;
public final class g implements Comparable {
    public final long f53582a;
    public final byte[] f53583b;

    public g(long j3, byte[] bArr) {
        this.f53582a = j3;
        this.f53583b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53582a, ((g) obj).f53582a);
    }
}
