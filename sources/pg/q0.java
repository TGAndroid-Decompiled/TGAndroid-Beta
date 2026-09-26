package pg;
public final class q0 implements Runnable {
    public final int f41201a;
    public final s0 f41202b;
    public final a5.a f41203c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41201a = i10;
        this.f41202b = s0Var;
        this.f41203c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41201a) {
            case 0:
                this.f41202b.p(this.f41203c, true);
                return;
            default:
                s0 s0Var = this.f41202b;
                s0Var.f41223f.f(new q0(s0Var, this.f41203c, 0));
                return;
        }
    }
}
