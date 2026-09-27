package u2;
public final class o0 implements Runnable {
    public final int f43784a;
    public final t0 f43785b;

    public o0(t0 t0Var, int i10) {
        this.f43784a = i10;
        this.f43785b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f43784a) {
            case 0:
                this.f43785b.Z = true;
                return;
            case 1:
                this.f43785b.w();
                return;
            default:
                t0 t0Var = this.f43785b;
                if (!t0Var.f43826f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.h(t0Var);
                    return;
                }
                return;
        }
    }
}
