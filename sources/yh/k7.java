package yh;
public final class k7 implements Runnable {
    public final long f52791a;
    public final int f52792b;
    public final int f52793c;
    public final boolean d;

    public k7(long j3, int i10, int i11, boolean z10) {
        this.f52791a = j3;
        this.f52792b = i10;
        this.f52793c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f52791a;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f52792b;
        int i12 = this.f52793c;
        if (i10 != 0) {
            o.g(i11).p(i12, j3);
        } else {
            m5.y(i11, this.d).X(i12);
        }
    }
}
