package z3;
public final class h implements Comparable {
    public final long f49258a;
    public final byte[] f49259b;

    public h(long j10, byte[] bArr) {
        this.f49258a = j10;
        this.f49259b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f49258a, ((h) obj).f49258a);
    }
}
