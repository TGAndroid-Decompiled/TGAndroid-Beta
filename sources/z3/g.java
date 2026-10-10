package z3;
public final class g implements Comparable {
    public final long f53539a;
    public final byte[] f53540b;

    public g(long j3, byte[] bArr) {
        this.f53539a = j3;
        this.f53540b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53539a, ((g) obj).f53539a);
    }
}
