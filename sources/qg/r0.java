package qg;
public final class r0 implements Runnable {
    public final int f44606a;
    public final t0 f44607b;
    public final a5.a f44608c;

    public r0(t0 t0Var, a5.a aVar, int i10) {
        this.f44606a = i10;
        this.f44607b = t0Var;
        this.f44608c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44606a) {
            case 0:
                this.f44607b.p(this.f44608c, true);
                return;
            default:
                t0 t0Var = this.f44607b;
                t0Var.f44638f.f(new r0(t0Var, this.f44608c, 0));
                return;
        }
    }
}
