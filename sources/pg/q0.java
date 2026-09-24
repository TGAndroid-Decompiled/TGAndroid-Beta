package pg;
public final class q0 implements Runnable {
    public final int f41188a;
    public final s0 f41189b;
    public final a5.a f41190c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41188a = i10;
        this.f41189b = s0Var;
        this.f41190c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41188a) {
            case 0:
                this.f41189b.p(this.f41190c, true);
                return;
            default:
                s0 s0Var = this.f41189b;
                s0Var.f41210f.f(new q0(s0Var, this.f41190c, 0));
                return;
        }
    }
}
