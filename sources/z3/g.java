package z3;
public final class g implements Comparable {
    public final long f50641a;
    public final byte[] f50642b;

    public g(long j10, byte[] bArr) {
        this.f50641a = j10;
        this.f50642b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50641a, ((g) obj).f50641a);
    }
}
