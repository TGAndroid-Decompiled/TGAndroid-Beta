package pg;
public final class q0 implements Runnable {
    public final int f41203a;
    public final s0 f41204b;
    public final a5.a f41205c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41203a = i10;
        this.f41204b = s0Var;
        this.f41205c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41203a) {
            case 0:
                this.f41204b.p(this.f41205c, true);
                return;
            default:
                s0 s0Var = this.f41204b;
                s0Var.f41225f.f(new q0(s0Var, this.f41205c, 0));
                return;
        }
    }
}
