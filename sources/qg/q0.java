package qg;
public final class q0 implements Runnable {
    public final int f44600a;
    public final t0 f44601b;

    public q0(t0 t0Var, int i10) {
        this.f44600a = i10;
        this.f44601b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44600a) {
            case 0:
                t0 t0Var = this.f44601b;
                t0Var.f44637c = null;
                ki.t1 t1Var = t0Var.f44635a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                this.f44601b.b();
                return;
        }
    }
}
