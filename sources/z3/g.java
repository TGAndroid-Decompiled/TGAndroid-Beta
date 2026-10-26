package z3;
public final class g implements Comparable {
    public final long f52649a;
    public final byte[] f52650b;

    public g(long j10, byte[] bArr) {
        this.f52649a = j10;
        this.f52650b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f52649a, ((g) obj).f52649a);
    }
}
