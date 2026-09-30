package pg;
public final class q0 implements Runnable {
    public final int f41204a;
    public final s0 f41205b;
    public final a5.a f41206c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41204a = i10;
        this.f41205b = s0Var;
        this.f41206c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41204a) {
            case 0:
                this.f41205b.p(this.f41206c, true);
                return;
            default:
                s0 s0Var = this.f41205b;
                s0Var.f41226f.f(new q0(s0Var, this.f41206c, 0));
                return;
        }
    }
}
