package yh;
public final class k7 implements Runnable {
    public final long f53027a;
    public final int f53028b;
    public final int f53029c;
    public final boolean d;

    public k7(long j3, int i10, int i11, boolean z10) {
        this.f53027a = j3;
        this.f53028b = i10;
        this.f53029c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f53027a;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f53028b;
        int i12 = this.f53029c;
        if (i10 != 0) {
            o.g(i11).p(i12, j3);
        } else {
            n5.y(i11, this.d).X(i12);
        }
    }
}
