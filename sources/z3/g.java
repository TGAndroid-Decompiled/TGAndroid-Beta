package z3;
public final class g implements Comparable {
    public final long f48387a;
    public final byte[] f48388b;

    public g(long j3, byte[] bArr) {
        this.f48387a = j3;
        this.f48388b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48387a, ((g) obj).f48387a);
    }
}
