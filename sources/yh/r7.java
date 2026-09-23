package yh;
public final class r7 implements Runnable {
    public final long f47651a;
    public final int f47652b;
    public final int f47653c;
    public final boolean d;

    public r7(long j3, int i10, int i11, boolean z10) {
        this.f47651a = j3;
        this.f47652b = i10;
        this.f47653c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47651a;
        int i10 = this.f47652b;
        int i11 = this.f47653c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            t5.y(i10, this.d).X(i11);
        }
    }
}
