package sg;
public final class q0 implements Runnable {
    public final int f55188a;
    public final r0 f55189b;

    public q0(r0 r0Var, int i7) {
        this.f55188a = i7;
        this.f55189b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f55188a) {
            case 0:
                u0 u0Var = this.f55189b.f55197b.d;
                if (u0Var != null) {
                    u0Var.postRunnable(u0Var.f55219x);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f55189b.f55197b.d;
                if (u0Var2 != null) {
                    u0Var2.postRunnable(u0Var2.f55219x);
                    return;
                }
                return;
            default:
                w0 w0Var = this.f55189b.f55197b;
                u0 u0Var3 = w0Var.d;
                u0Var3.getClass();
                u0Var3.postRunnable(new s0(u0Var3, 2));
                w0Var.d = null;
                return;
        }
    }
}
