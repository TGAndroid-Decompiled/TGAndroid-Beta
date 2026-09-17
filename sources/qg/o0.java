package qg;
public final class o0 implements Runnable {
    public final int f44495a;
    public final q0 f44496b;
    public final a5.a f44497c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f44495a = i10;
        this.f44496b = q0Var;
        this.f44497c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f44495a) {
            case 0:
                this.f44496b.p(this.f44497c, true);
                return;
            default:
                q0 q0Var = this.f44496b;
                q0Var.f44523f.f(new o0(q0Var, this.f44497c, 0));
                return;
        }
    }
}
