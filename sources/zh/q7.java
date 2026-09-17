package zh;
public final class q7 implements Runnable {
    public final long f52484a;
    public final int f52485b;
    public final int f52486c;
    public final boolean d;

    public q7(long j3, int i10, int i11, boolean z10) {
        this.f52484a = j3;
        this.f52485b = i10;
        this.f52486c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f52484a;
        int i10 = this.f52485b;
        int i11 = this.f52486c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            s5.y(i10, this.d).X(i11);
        }
    }
}
