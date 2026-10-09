package pg;
public final class q0 implements Runnable {
    public final int f45720a;
    public final s0 f45721b;
    public final a5.a f45722c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45720a = i10;
        this.f45721b = s0Var;
        this.f45722c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45720a) {
            case 0:
                this.f45721b.p(this.f45722c, true);
                return;
            default:
                s0 s0Var = this.f45721b;
                s0Var.f45757f.f(new q0(s0Var, this.f45722c, 0));
                return;
        }
    }
}
