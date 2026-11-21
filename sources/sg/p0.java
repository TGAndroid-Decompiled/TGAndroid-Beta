package sg;
public final class p0 implements Runnable {
    public final int f57356a;
    public final q0 f57357b;

    public p0(q0 q0Var, int i7) {
        this.f57356a = i7;
        this.f57357b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f57356a) {
            case 0:
                s0 s0Var = this.f57357b.f57367b.d;
                if (s0Var != null) {
                    s0Var.postRunnable(s0Var.f57387x);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f57357b.f57367b.d;
                if (s0Var2 != null) {
                    s0Var2.postRunnable(s0Var2.f57387x);
                    return;
                }
                return;
            default:
                u0 u0Var = this.f57357b.f57367b;
                s0 s0Var3 = u0Var.d;
                s0Var3.getClass();
                s0Var3.postRunnable(new r0(s0Var3, 2));
                u0Var.d = null;
                return;
        }
    }
}
