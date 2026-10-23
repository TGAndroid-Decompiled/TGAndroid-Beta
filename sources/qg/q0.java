package qg;
public final class q0 implements Runnable {
    public final int f44604a;
    public final t0 f44605b;

    public q0(t0 t0Var, int i10) {
        this.f44604a = i10;
        this.f44605b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44604a) {
            case 0:
                t0 t0Var = this.f44605b;
                t0Var.f44641c = null;
                ki.t1 t1Var = t0Var.f44639a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                this.f44605b.b();
                return;
        }
    }
}
