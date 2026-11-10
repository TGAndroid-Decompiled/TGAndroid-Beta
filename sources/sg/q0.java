package sg;
public final class q0 implements Runnable {
    public final int f55197a;
    public final r0 f55198b;

    public q0(r0 r0Var, int i7) {
        this.f55197a = i7;
        this.f55198b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f55197a) {
            case 0:
                t0 t0Var = this.f55198b.f55206b.d;
                if (t0Var != null) {
                    t0Var.postRunnable(t0Var.f55223x);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f55198b.f55206b.d;
                if (t0Var2 != null) {
                    t0Var2.postRunnable(t0Var2.f55223x);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f55198b.f55206b;
                t0 t0Var3 = v0Var.d;
                t0Var3.getClass();
                t0Var3.postRunnable(new s0(t0Var3, 2));
                v0Var.d = null;
                return;
        }
    }
}
