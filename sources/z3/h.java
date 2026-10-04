package z3;
public final class h implements Comparable {
    public final long f52362a;
    public final byte[] f52363b;

    public h(long j3, byte[] bArr) {
        this.f52362a = j3;
        this.f52363b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52362a, ((h) obj).f52362a);
    }
}
