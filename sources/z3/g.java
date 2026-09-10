package z3;
public final class g implements Comparable {
    public final long f47203a;
    public final byte[] f47204b;

    public g(long j3, byte[] bArr) {
        this.f47203a = j3;
        this.f47204b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f47203a, ((g) obj).f47203a);
    }
}
