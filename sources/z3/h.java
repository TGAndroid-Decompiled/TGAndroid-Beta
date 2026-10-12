package z3;
public final class h implements Comparable {
    public final long f49259a;
    public final byte[] f49260b;

    public h(long j10, byte[] bArr) {
        this.f49259a = j10;
        this.f49260b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f49259a, ((h) obj).f49259a);
    }
}
