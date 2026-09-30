package z3;
public final class g implements Comparable {
    public final long f48469a;
    public final byte[] f48470b;

    public g(long j3, byte[] bArr) {
        this.f48469a = j3;
        this.f48470b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48469a, ((g) obj).f48469a);
    }
}
