package z3;
public final class h implements Comparable {
    public final long f52363a;
    public final byte[] f52364b;

    public h(long j3, byte[] bArr) {
        this.f52363a = j3;
        this.f52364b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52363a, ((h) obj).f52363a);
    }
}
