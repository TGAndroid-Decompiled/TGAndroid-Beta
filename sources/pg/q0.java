package pg;
public final class q0 implements Runnable {
    public final int f41200a;
    public final s0 f41201b;
    public final a5.a f41202c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f41200a = i10;
        this.f41201b = s0Var;
        this.f41202c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f41200a) {
            case 0:
                this.f41201b.p(this.f41202c, true);
                return;
            default:
                s0 s0Var = this.f41201b;
                s0Var.f41222f.f(new q0(s0Var, this.f41202c, 0));
                return;
        }
    }
}
