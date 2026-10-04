package z3;
public final class h implements Comparable {
    public final long f52368a;
    public final byte[] f52369b;

    public h(long j3, byte[] bArr) {
        this.f52368a = j3;
        this.f52369b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52368a, ((h) obj).f52368a);
    }
}
