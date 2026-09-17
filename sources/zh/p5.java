package zh;
public final class p5 implements Runnable {
    public final int f52456a;
    public final r5 f52457b;
    public final long f52458c;

    public p5(r5 r5Var, long j3, int i10) {
        this.f52456a = i10;
        this.f52457b = r5Var;
        this.f52458c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52456a) {
            case 0:
                r5 r5Var = this.f52457b;
                r5Var.f52558q.d0(r5Var.f52545b, r5Var.f52546c, this.f52458c, true, true, r5Var.f52555n);
                return;
            default:
                r5 r5Var2 = this.f52457b;
                r5Var2.f52558q.d0(r5Var2.f52545b, r5Var2.f52546c, this.f52458c, true, true, r5Var2.f52555n);
                return;
        }
    }
}
