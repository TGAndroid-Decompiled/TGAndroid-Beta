package sg;
public final class p0 implements Runnable {
    public final int f57360a;
    public final q0 f57361b;

    public p0(q0 q0Var, int i7) {
        this.f57360a = i7;
        this.f57361b = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f57360a) {
            case 0:
                s0 s0Var = this.f57361b.f57371b.d;
                if (s0Var != null) {
                    s0Var.postRunnable(s0Var.f57391x);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.f57361b.f57371b.d;
                if (s0Var2 != null) {
                    s0Var2.postRunnable(s0Var2.f57391x);
                    return;
                }
                return;
            default:
                u0 u0Var = this.f57361b.f57371b;
                s0 s0Var3 = u0Var.d;
                s0Var3.getClass();
                s0Var3.postRunnable(new r0(s0Var3, 2));
                u0Var.d = null;
                return;
        }
    }
}
