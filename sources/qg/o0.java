package qg;
public final class o0 implements Runnable {
    public final int f43241a;
    public final q0 f43242b;
    public final a5.a f43243c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f43241a = i10;
        this.f43242b = q0Var;
        this.f43243c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f43241a) {
            case 0:
                this.f43242b.p(this.f43243c, true);
                return;
            default:
                q0 q0Var = this.f43242b;
                q0Var.f43266f.f(new o0(q0Var, this.f43243c, 0));
                return;
        }
    }
}
