package u2;
public final class o0 implements Runnable {
    public final int f48778a;
    public final t0 f48779b;

    public o0(t0 t0Var, int i10) {
        this.f48778a = i10;
        this.f48779b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f48778a) {
            case 0:
                this.f48779b.Z = true;
                return;
            case 1:
                this.f48779b.t();
                return;
            default:
                t0 t0Var = this.f48779b;
                if (!t0Var.f48822f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.D(t0Var);
                    return;
                }
                return;
        }
    }
}
