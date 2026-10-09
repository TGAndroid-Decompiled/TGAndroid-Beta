package z3;
public final class g implements Comparable {
    public final long f53493a;
    public final byte[] f53494b;

    public g(long j3, byte[] bArr) {
        this.f53493a = j3;
        this.f53494b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f53493a, ((g) obj).f53493a);
    }
}
