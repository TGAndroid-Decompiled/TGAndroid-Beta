package sg;
public final class q0 implements Runnable {
    public final int f55095a;
    public final r0 f55096b;

    public q0(r0 r0Var, int i7) {
        this.f55095a = i7;
        this.f55096b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f55095a) {
            case 0:
                u0 u0Var = this.f55096b.f55104b.d;
                if (u0Var != null) {
                    u0Var.postRunnable(u0Var.f55126x);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f55096b.f55104b.d;
                if (u0Var2 != null) {
                    u0Var2.postRunnable(u0Var2.f55126x);
                    return;
                }
                return;
            default:
                w0 w0Var = this.f55096b.f55104b;
                u0 u0Var3 = w0Var.d;
                u0Var3.getClass();
                u0Var3.postRunnable(new s0(u0Var3, 2));
                w0Var.d = null;
                return;
        }
    }
}
