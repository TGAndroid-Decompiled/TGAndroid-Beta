package z3;
public final class g implements Comparable {
    public final long f50651a;
    public final byte[] f50652b;

    public g(long j10, byte[] bArr) {
        this.f50651a = j10;
        this.f50652b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f50651a, ((g) obj).f50651a);
    }
}
