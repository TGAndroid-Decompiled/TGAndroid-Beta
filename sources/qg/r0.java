package qg;
public final class r0 implements Runnable {
    public final int f44596a;
    public final t0 f44597b;
    public final a5.a f44598c;

    public r0(t0 t0Var, a5.a aVar, int i10) {
        this.f44596a = i10;
        this.f44597b = t0Var;
        this.f44598c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44596a) {
            case 0:
                this.f44597b.p(this.f44598c, true);
                return;
            default:
                t0 t0Var = this.f44597b;
                t0Var.f44628f.f(new r0(t0Var, this.f44598c, 0));
                return;
        }
    }
}
