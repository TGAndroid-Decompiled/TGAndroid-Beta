package u2;
public final class q0 implements Runnable {
    public final int f47420a;
    public final x0 f47421b;

    public q0(x0 x0Var, int i10) {
        this.f47420a = i10;
        this.f47421b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f47420a) {
            case 0:
                this.f47421b.f47471b0 = true;
                return;
            case 1:
                this.f47421b.w();
                return;
            default:
                x0 x0Var = this.f47421b;
                if (!x0Var.f47479h0) {
                    d0 d0Var = x0Var.I;
                    d0Var.getClass();
                    d0Var.h(x0Var);
                    return;
                }
                return;
        }
    }
}
