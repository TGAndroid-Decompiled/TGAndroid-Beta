package zh;
public final class p5 implements Runnable {
    public final int f52455a;
    public final r5 f52456b;
    public final long f52457c;

    public p5(r5 r5Var, long j3, int i10) {
        this.f52455a = i10;
        this.f52456b = r5Var;
        this.f52457c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52455a) {
            case 0:
                r5 r5Var = this.f52456b;
                r5Var.f52557q.d0(r5Var.f52544b, r5Var.f52545c, this.f52457c, true, true, r5Var.f52554n);
                return;
            default:
                r5 r5Var2 = this.f52456b;
                r5Var2.f52557q.d0(r5Var2.f52544b, r5Var2.f52545c, this.f52457c, true, true, r5Var2.f52554n);
                return;
        }
    }
}
