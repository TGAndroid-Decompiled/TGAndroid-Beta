package yh;
public final class s7 implements Runnable {
    public final long f51988a;
    public final int f51989b;
    public final int f51990c;
    public final boolean d;

    public s7(long j3, int i10, int i11, boolean z10) {
        this.f51988a = j3;
        this.f51989b = i10;
        this.f51990c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f51988a;
        int i10 = this.f51989b;
        int i11 = this.f51990c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            t5.y(i10, this.d).X(i11);
        }
    }
}
