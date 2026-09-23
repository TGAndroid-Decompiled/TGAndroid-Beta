package yh;
public final class r5 implements Runnable {
    public final int f47645a;
    public final s5 f47646b;
    public final long f47647c;

    public r5(s5 s5Var, long j3, int i10) {
        this.f47645a = i10;
        this.f47646b = s5Var;
        this.f47647c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47645a) {
            case 0:
                s5 s5Var = this.f47646b;
                s5Var.f47708q.d0(s5Var.f47696b, s5Var.f47697c, this.f47647c, true, true, s5Var.f47705n);
                return;
            default:
                s5 s5Var2 = this.f47646b;
                s5Var2.f47708q.d0(s5Var2.f47696b, s5Var2.f47697c, this.f47647c, true, true, s5Var2.f47705n);
                return;
        }
    }
}
