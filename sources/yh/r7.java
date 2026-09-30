package yh;
public final class r7 implements Runnable {
    public final long f47964a;
    public final int f47965b;
    public final int f47966c;
    public final boolean d;

    public r7(long j3, int i10, int i11, boolean z10) {
        this.f47964a = j3;
        this.f47965b = i10;
        this.f47966c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47964a;
        int i10 = this.f47965b;
        int i11 = this.f47966c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            t5.y(i10, this.d).X(i11);
        }
    }
}
