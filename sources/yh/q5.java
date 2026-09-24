package yh;
public final class q5 implements Runnable {
    public final int f47900a;
    public final s5 f47901b;
    public final long f47902c;

    public q5(s5 s5Var, long j3, int i10) {
        this.f47900a = i10;
        this.f47901b = s5Var;
        this.f47902c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47900a) {
            case 0:
                s5 s5Var = this.f47901b;
                s5Var.f48002q.d0(s5Var.f47990b, s5Var.f47991c, this.f47902c, true, true, s5Var.f47999n);
                return;
            default:
                s5 s5Var2 = this.f47901b;
                s5Var2.f48002q.d0(s5Var2.f47990b, s5Var2.f47991c, this.f47902c, true, true, s5Var2.f47999n);
                return;
        }
    }
}
