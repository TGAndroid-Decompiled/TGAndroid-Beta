package u2;
public final class q0 implements Runnable {
    public final int f47424a;
    public final x0 f47425b;

    public q0(x0 x0Var, int i10) {
        this.f47424a = i10;
        this.f47425b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f47424a) {
            case 0:
                this.f47425b.f47475b0 = true;
                return;
            case 1:
                this.f47425b.w();
                return;
            default:
                x0 x0Var = this.f47425b;
                if (!x0Var.f47483h0) {
                    d0 d0Var = x0Var.I;
                    d0Var.getClass();
                    d0Var.h(x0Var);
                    return;
                }
                return;
        }
    }
}
