package yh;
public final class q7 implements Runnable {
    public final long f47923a;
    public final int f47924b;
    public final int f47925c;
    public final boolean d;

    public q7(long j3, int i10, int i11, boolean z10) {
        this.f47923a = j3;
        this.f47924b = i10;
        this.f47925c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47923a;
        int i10 = this.f47924b;
        int i11 = this.f47925c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            t5.y(i10, this.d).X(i11);
        }
    }
}
