package pg;
public final class q0 implements Runnable {
    public final int f41251a;
    public final s0 f41252b;
    public final a5.a f41253c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41251a = i10;
        this.f41252b = s0Var;
        this.f41253c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41251a) {
            case 0:
                this.f41252b.p(this.f41253c, true);
                return;
            default:
                s0 s0Var = this.f41252b;
                s0Var.f41273f.f(new q0(s0Var, this.f41253c, 0));
                return;
        }
    }
}
