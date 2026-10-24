package qg;
public final class p0 implements Runnable {
    public final int f45013a;
    public final s0 f45014b;

    public p0(s0 s0Var, int i10) {
        this.f45013a = i10;
        this.f45014b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45013a) {
            case 0:
                s0 s0Var = this.f45014b;
                s0Var.f45045c = null;
                ki.t1 t1Var = s0Var.f45043a;
                if (t1Var != null) {
                    t1Var.J();
                    return;
                }
                return;
            default:
                this.f45014b.b();
                return;
        }
    }
}
