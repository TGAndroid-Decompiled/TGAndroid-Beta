package z3;
public final class g implements Comparable {
    public final long f50663a;
    public final byte[] f50664b;

    public g(long j10, byte[] bArr) {
        this.f50663a = j10;
        this.f50664b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50663a, ((g) obj).f50663a);
    }
}
