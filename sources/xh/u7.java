package xh;
public final class u7 implements Runnable {
    public final long f46155a;
    public final int f46156b;
    public final int f46157c;
    public final boolean d;

    public u7(long j3, int i10, int i11, boolean z10) {
        this.f46155a = j3;
        this.f46156b = i10;
        this.f46157c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f46155a;
        int i10 = this.f46156b;
        int i11 = this.f46157c;
        if (j3 != 0) {
            p.g(i10).p(i11, j3);
        } else {
            v5.y(i10, this.d).X(i11);
        }
    }
}
