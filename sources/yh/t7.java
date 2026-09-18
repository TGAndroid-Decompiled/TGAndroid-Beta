package yh;
public final class t7 implements Runnable {
    public final long f47862a;
    public final int f47863b;
    public final int f47864c;
    public final boolean d;

    public t7(long j3, int i10, int i11, boolean z10) {
        this.f47862a = j3;
        this.f47863b = i10;
        this.f47864c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47862a;
        int i10 = this.f47863b;
        int i11 = this.f47864c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            v5.y(i10, this.d).X(i11);
        }
    }
}
