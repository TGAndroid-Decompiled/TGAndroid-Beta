package sg;
public final class o0 implements Runnable {
    public final int f57428a;
    public final p0 f57429b;

    public o0(p0 p0Var, int i7) {
        this.f57428a = i7;
        this.f57429b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f57428a) {
            case 0:
                r0 r0Var = this.f57429b.f57436b.d;
                if (r0Var != null) {
                    r0Var.postRunnable(r0Var.f57462x);
                    return;
                }
                return;
            case 1:
                r0 r0Var2 = this.f57429b.f57436b.d;
                if (r0Var2 != null) {
                    r0Var2.postRunnable(r0Var2.f57462x);
                    return;
                }
                return;
            default:
                t0 t0Var = this.f57429b.f57436b;
                r0 r0Var3 = t0Var.d;
                r0Var3.getClass();
                r0Var3.postRunnable(new q0(r0Var3, 2));
                t0Var.d = null;
                return;
        }
    }
}
