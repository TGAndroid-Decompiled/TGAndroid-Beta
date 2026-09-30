package yh;
public final class r7 implements Runnable {
    public final long f48081a;
    public final int f48082b;
    public final int f48083c;
    public final boolean d;

    public r7(long j3, int i10, int i11, boolean z10) {
        this.f48081a = j3;
        this.f48082b = i10;
        this.f48083c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f48081a;
        int i10 = this.f48082b;
        int i11 = this.f48083c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            s5.y(i10, this.d).X(i11);
        }
    }
}
