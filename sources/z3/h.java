package z3;
public final class h implements Comparable {
    public final long f48080a;
    public final byte[] f48081b;

    public h(long j3, byte[] bArr) {
        this.f48080a = j3;
        this.f48081b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f48080a, ((h) obj).f48080a);
    }
}
