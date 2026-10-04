package pg;
public final class q0 implements Runnable {
    public final int f44560a;
    public final s0 f44561b;
    public final a5.a f44562c;

    public q0(s0 s0Var, a5.a aVar, int i10) {
        this.f44560a = i10;
        this.f44561b = s0Var;
        this.f44562c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44560a) {
            case 0:
                this.f44561b.p(this.f44562c, true);
                return;
            default:
                s0 s0Var = this.f44561b;
                s0Var.f44586f.f(new q0(s0Var, this.f44562c, 0));
                return;
        }
    }
}
