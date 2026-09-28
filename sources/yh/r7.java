package yh;
public final class r7 implements Runnable {
    public final long f47974a;
    public final int f47975b;
    public final int f47976c;
    public final boolean d;

    public r7(long j3, int i10, int i11, boolean z10) {
        this.f47974a = j3;
        this.f47975b = i10;
        this.f47976c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47974a;
        int i10 = this.f47975b;
        int i11 = this.f47976c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            s5.y(i10, this.d).X(i11);
        }
    }
}
