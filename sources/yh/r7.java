package yh;
public final class r7 implements Runnable {
    public final long f48025a;
    public final int f48026b;
    public final int f48027c;
    public final boolean d;

    public r7(long j3, int i10, int i11, boolean z10) {
        this.f48025a = j3;
        this.f48026b = i10;
        this.f48027c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f48025a;
        int i10 = this.f48026b;
        int i11 = this.f48027c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            u5.y(i10, this.d).X(i11);
        }
    }
}
