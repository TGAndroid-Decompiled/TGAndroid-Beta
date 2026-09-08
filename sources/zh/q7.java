package zh;
public final class q7 implements Runnable {
    public final long f52514a;
    public final int f52515b;
    public final int f52516c;
    public final boolean d;

    public q7(long j3, int i10, int i11, boolean z10) {
        this.f52514a = j3;
        this.f52515b = i10;
        this.f52516c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f52514a;
        int i10 = this.f52515b;
        int i11 = this.f52516c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            s5.y(i10, this.d).X(i11);
        }
    }
}
