package pg;
public final class q0 implements Runnable {
    public final int f41191a;
    public final s0 f41192b;
    public final a5.a f41193c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41191a = i10;
        this.f41192b = s0Var;
        this.f41193c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41191a) {
            case 0:
                this.f41192b.p(this.f41193c, true);
                return;
            default:
                s0 s0Var = this.f41192b;
                s0Var.f41223f.f(new q0(s0Var, this.f41193c, 0));
                return;
        }
    }
}
