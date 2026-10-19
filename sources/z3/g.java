package z3;
public final class g implements Comparable {
    public final long f50643a;
    public final byte[] f50644b;

    public g(long j10, byte[] bArr) {
        this.f50643a = j10;
        this.f50644b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50643a, ((g) obj).f50643a);
    }
}
