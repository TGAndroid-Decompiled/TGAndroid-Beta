package sg;
public final class q0 implements Runnable {
    public final int f55198a;
    public final r0 f55199b;

    public q0(r0 r0Var, int i7) {
        this.f55198a = i7;
        this.f55199b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f55198a) {
            case 0:
                t0 t0Var = this.f55199b.f55207b.d;
                if (t0Var != null) {
                    t0Var.postRunnable(t0Var.f55224x);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f55199b.f55207b.d;
                if (t0Var2 != null) {
                    t0Var2.postRunnable(t0Var2.f55224x);
                    return;
                }
                return;
            default:
                v0 v0Var = this.f55199b.f55207b;
                t0 t0Var3 = v0Var.d;
                t0Var3.getClass();
                t0Var3.postRunnable(new s0(t0Var3, 2));
                v0Var.d = null;
                return;
        }
    }
}
