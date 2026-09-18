package z3;
public final class g implements Comparable {
    public final long f48115a;
    public final byte[] f48116b;

    public g(long j3, byte[] bArr) {
        this.f48115a = j3;
        this.f48116b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48115a, ((g) obj).f48115a);
    }
}
