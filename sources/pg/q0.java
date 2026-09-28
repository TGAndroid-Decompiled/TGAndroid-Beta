package pg;
public final class q0 implements Runnable {
    public final int f41202a;
    public final s0 f41203b;
    public final a5.a f41204c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41202a = i10;
        this.f41203b = s0Var;
        this.f41204c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41202a) {
            case 0:
                this.f41203b.p(this.f41204c, true);
                return;
            default:
                s0 s0Var = this.f41203b;
                s0Var.f41224f.f(new q0(s0Var, this.f41204c, 0));
                return;
        }
    }
}
