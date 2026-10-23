package z3;
public final class g implements Comparable {
    public final long f50652a;
    public final byte[] f50653b;

    public g(long j10, byte[] bArr) {
        this.f50652a = j10;
        this.f50653b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50652a, ((g) obj).f50652a);
    }
}
