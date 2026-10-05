package yh;
public final class u7 implements Runnable {
    public final long f52111a;
    public final int f52112b;
    public final int f52113c;
    public final boolean d;

    public u7(long j3, int i10, int i11, boolean z10) {
        this.f52111a = j3;
        this.f52112b = i10;
        this.f52113c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f52111a;
        int i10 = this.f52112b;
        int i11 = this.f52113c;
        if (j3 != 0) {
            p.g(i10).p(i11, j3);
        } else {
            u5.y(i10, this.d).X(i11);
        }
    }
}
