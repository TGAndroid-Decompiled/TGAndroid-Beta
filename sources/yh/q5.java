package yh;
public final class q5 implements Runnable {
    public final int f51870a;
    public final s5 f51871b;
    public final long f51872c;

    public q5(s5 s5Var, long j3, int i10) {
        this.f51870a = i10;
        this.f51871b = s5Var;
        this.f51872c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51870a) {
            case 0:
                s5 s5Var = this.f51871b;
                s5Var.f51983q.d0(s5Var.f51970b, s5Var.f51971c, this.f51872c, true, true, s5Var.f51980n);
                return;
            default:
                s5 s5Var2 = this.f51871b;
                s5Var2.f51983q.d0(s5Var2.f51970b, s5Var2.f51971c, this.f51872c, true, true, s5Var2.f51980n);
                return;
        }
    }
}
