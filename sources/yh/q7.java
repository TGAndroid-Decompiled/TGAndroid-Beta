package yh;
public final class q7 implements Runnable {
    public final long f47979a;
    public final int f47980b;
    public final int f47981c;
    public final boolean d;

    public q7(long j3, int i10, int i11, boolean z10) {
        this.f47979a = j3;
        this.f47980b = i10;
        this.f47981c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47979a;
        int i10 = this.f47980b;
        int i11 = this.f47981c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            s5.y(i10, this.d).X(i11);
        }
    }
}
