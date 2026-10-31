package rh;
public final class d8 implements Runnable {
    public final long f46765a;
    public final int f46766b;
    public final int f46767c;
    public final boolean d;

    public d8(int i10, int i11, long j10, boolean z10) {
        this.f46765a = j10;
        this.f46766b = i10;
        this.f46767c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f46765a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f46766b;
        int i12 = this.f46767c;
        if (i10 != 0) {
            r.g(i11).p(i12, j10);
        } else {
            e6.y(i11, this.d).W(i12);
        }
    }
}
