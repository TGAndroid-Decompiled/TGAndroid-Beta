package z3;
public final class g implements Comparable {
    public final long f52646a;
    public final byte[] f52647b;

    public g(long j10, byte[] bArr) {
        this.f52646a = j10;
        this.f52647b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52646a, ((g) obj).f52646a);
    }
}
