package pg;
public final class q0 implements Runnable {
    public final int f45722a;
    public final s0 f45723b;
    public final a5.a f45724c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f45722a = i10;
        this.f45723b = s0Var;
        this.f45724c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f45722a) {
            case 0:
                this.f45723b.p(this.f45724c, true);
                return;
            default:
                s0 s0Var = this.f45723b;
                s0Var.f45759f.f(new q0(s0Var, this.f45724c, 0));
                return;
        }
    }
}
