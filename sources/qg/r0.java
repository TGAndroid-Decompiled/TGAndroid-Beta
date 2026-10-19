package qg;
public final class r0 implements Runnable {
    public final int f44598a;
    public final t0 f44599b;
    public final a5.a f44600c;

    public r0(t0 t0Var, a5.a aVar, int i10) {
        this.f44598a = i10;
        this.f44599b = t0Var;
        this.f44600c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44598a) {
            case 0:
                this.f44599b.p(this.f44600c, true);
                return;
            default:
                t0 t0Var = this.f44599b;
                t0Var.f44630f.f(new r0(t0Var, this.f44600c, 0));
                return;
        }
    }
}
