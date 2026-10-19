package qg;
public final class q0 implements Runnable {
    public final int f44592a;
    public final t0 f44593b;

    public q0(t0 t0Var, int i10) {
        this.f44592a = i10;
        this.f44593b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44592a) {
            case 0:
                t0 t0Var = this.f44593b;
                t0Var.f44629c = null;
                ki.t1 t1Var = t0Var.f44627a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                this.f44593b.b();
                return;
        }
    }
}
