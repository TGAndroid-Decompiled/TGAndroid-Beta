package qg;
public final class q0 implements Runnable {
    public final int f44603a;
    public final t0 f44604b;

    public q0(t0 t0Var, int i10) {
        this.f44603a = i10;
        this.f44604b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44603a) {
            case 0:
                t0 t0Var = this.f44604b;
                t0Var.f44640c = null;
                ki.t1 t1Var = t0Var.f44638a;
                if (t1Var != null) {
                    t1Var.s();
                    return;
                }
                return;
            default:
                this.f44604b.b();
                return;
        }
    }
}
