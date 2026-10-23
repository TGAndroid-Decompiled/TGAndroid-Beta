package qg;
public final class p0 implements Runnable {
    public final int f45014a;
    public final s0 f45015b;

    public p0(s0 s0Var, int i10) {
        this.f45014a = i10;
        this.f45015b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45014a) {
            case 0:
                s0 s0Var = this.f45015b;
                s0Var.f45046c = null;
                ki.t1 t1Var = s0Var.f45044a;
                if (t1Var != null) {
                    t1Var.J();
                    return;
                }
                return;
            default:
                this.f45015b.b();
                return;
        }
    }
}
