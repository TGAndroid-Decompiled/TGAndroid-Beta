package z3;
public final class g implements Comparable {
    public final long f48407a;
    public final byte[] f48408b;

    public g(long j3, byte[] bArr) {
        this.f48407a = j3;
        this.f48408b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48407a, ((g) obj).f48407a);
    }
}
