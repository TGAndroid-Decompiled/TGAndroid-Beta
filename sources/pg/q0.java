package pg;
public final class q0 implements Runnable {
    public final int f41301a;
    public final s0 f41302b;
    public final a5.a f41303c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41301a = i10;
        this.f41302b = s0Var;
        this.f41303c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41301a) {
            case 0:
                this.f41302b.p(this.f41303c, true);
                return;
            default:
                s0 s0Var = this.f41302b;
                s0Var.f41323f.f(new q0(s0Var, this.f41303c, 0));
                return;
        }
    }
}
