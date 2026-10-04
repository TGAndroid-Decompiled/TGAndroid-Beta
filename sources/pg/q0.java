package pg;
public final class q0 implements Runnable {
    public final int f44568a;
    public final s0 f44569b;
    public final a5.a f44570c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44568a = i10;
        this.f44569b = s0Var;
        this.f44570c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44568a) {
            case 0:
                this.f44569b.p(this.f44570c, true);
                return;
            default:
                s0 s0Var = this.f44569b;
                s0Var.f44594f.f(new q0(s0Var, this.f44570c, 0));
                return;
        }
    }
}
