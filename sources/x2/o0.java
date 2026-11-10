package x2;
public final class o0 implements Runnable {
    public final int f58443a;
    public final v0 f58444b;

    public o0(v0 v0Var, int i7) {
        this.f58443a = i7;
        this.f58444b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f58443a) {
            case 0:
                this.f58444b.f58501b0 = true;
                return;
            case 1:
                this.f58444b.u();
                return;
            default:
                v0 v0Var = this.f58444b;
                if (!v0Var.f58510h0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.d(v0Var);
                    return;
                }
                return;
        }
    }
}
