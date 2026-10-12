package zh;
public final class k7 implements Runnable {
    public final long f50770a;
    public final int f50771b;
    public final int f50772c;
    public final boolean d;

    public k7(long j10, int i10, int i11, boolean z10) {
        this.f50770a = j10;
        this.f50771b = i10;
        this.f50772c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f50770a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f50771b;
        int i12 = this.f50772c;
        if (i10 != 0) {
            p.g(i11).p(i12, j10);
        } else {
            n5.y(i11, this.d).X(i12);
        }
    }
}
