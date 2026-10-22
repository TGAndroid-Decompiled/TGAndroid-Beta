package u2;
public final class q0 implements Runnable {
    public final int f47423a;
    public final x0 f47424b;

    public q0(x0 x0Var, int i10) {
        this.f47423a = i10;
        this.f47424b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f47423a) {
            case 0:
                this.f47424b.f47474b0 = true;
                return;
            case 1:
                this.f47424b.w();
                return;
            default:
                x0 x0Var = this.f47424b;
                if (!x0Var.f47482h0) {
                    d0 d0Var = x0Var.I;
                    d0Var.getClass();
                    d0Var.h(x0Var);
                    return;
                }
                return;
        }
    }
}
