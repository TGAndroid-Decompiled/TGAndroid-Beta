package pg;
public final class q0 implements Runnable {
    public final int f44561a;
    public final s0 f44562b;
    public final a5.a f44563c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44561a = i10;
        this.f44562b = s0Var;
        this.f44563c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44561a) {
            case 0:
                this.f44562b.p(this.f44563c, true);
                return;
            default:
                s0 s0Var = this.f44562b;
                s0Var.f44587f.f(new q0(s0Var, this.f44563c, 0));
                return;
        }
    }
}
