package pg;
public final class q0 implements Runnable {
    public final int f41232a;
    public final s0 f41233b;
    public final a5.a f41234c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41232a = i10;
        this.f41233b = s0Var;
        this.f41234c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41232a) {
            case 0:
                this.f41233b.p(this.f41234c, true);
                return;
            default:
                s0 s0Var = this.f41233b;
                s0Var.f41264f.f(new q0(s0Var, this.f41234c, 0));
                return;
        }
    }
}
