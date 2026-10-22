package qg;
public final class r0 implements Runnable {
    public final int f44609a;
    public final t0 f44610b;
    public final a5.a f44611c;

    public r0(t0 t0Var, a5.a aVar, int i10) {
        this.f44609a = i10;
        this.f44610b = t0Var;
        this.f44611c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44609a) {
            case 0:
                this.f44610b.p(this.f44611c, true);
                return;
            default:
                t0 t0Var = this.f44610b;
                t0Var.f44641f.f(new r0(t0Var, this.f44611c, 0));
                return;
        }
    }
}
