package tg;
public final class p0 implements Runnable {
    public final int f55283a;
    public final q0 f55284b;

    public p0(q0 q0Var, int i3) {
        this.f55283a = i3;
        this.f55284b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f55283a) {
            case 0:
                s0 s0Var = this.f55284b.f55293b.d;
                if (s0Var != null) {
                    s0Var.postRunnable(s0Var.f55313x);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f55284b.f55293b.d;
                if (s0Var2 != null) {
                    s0Var2.postRunnable(s0Var2.f55313x);
                    return;
                }
                return;
            default:
                u0 u0Var = this.f55284b.f55293b;
                s0 s0Var3 = u0Var.d;
                s0Var3.getClass();
                s0Var3.postRunnable(new r0(s0Var3, 2));
                u0Var.d = null;
                return;
        }
    }
}
