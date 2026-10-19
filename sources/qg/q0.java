package qg;
public final class q0 implements Runnable {
    public final int f44590a;
    public final t0 f44591b;

    public q0(t0 t0Var, int i10) {
        this.f44590a = i10;
        this.f44591b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44590a) {
            case 0:
                t0 t0Var = this.f44591b;
                t0Var.f44627c = null;
                ki.t1 t1Var = t0Var.f44625a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                this.f44591b.b();
                return;
        }
    }
}
