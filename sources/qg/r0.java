package qg;
public final class r0 implements Runnable {
    public final int f44610a;
    public final t0 f44611b;
    public final a5.a f44612c;

    public r0(t0 t0Var, a5.a aVar, int i10) {
        this.f44610a = i10;
        this.f44611b = t0Var;
        this.f44612c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44610a) {
            case 0:
                this.f44611b.p(this.f44612c, true);
                return;
            default:
                t0 t0Var = this.f44611b;
                t0Var.f44642f.f(new r0(t0Var, this.f44612c, 0));
                return;
        }
    }
}
