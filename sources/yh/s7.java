package yh;
public final class s7 implements Runnable {
    public final long f47739a;
    public final int f47740b;
    public final int f47741c;
    public final boolean d;

    public s7(long j3, int i10, int i11, boolean z10) {
        this.f47739a = j3;
        this.f47740b = i10;
        this.f47741c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47739a;
        int i10 = this.f47740b;
        int i11 = this.f47741c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            u5.y(i10, this.d).X(i11);
        }
    }
}
