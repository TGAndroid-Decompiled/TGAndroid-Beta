package u2;
public final class r0 implements Runnable {
    public final int f47878a;
    public final y0 f47879b;

    public r0(y0 y0Var, int i10) {
        this.f47878a = i10;
        this.f47879b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f47878a) {
            case 0:
                this.f47879b.f47929b0 = true;
                return;
            case 1:
                this.f47879b.w();
                return;
            default:
                y0 y0Var = this.f47879b;
                if (!y0Var.f47937h0) {
                    e0 e0Var = y0Var.I;
                    e0Var.getClass();
                    e0Var.b(y0Var);
                    return;
                }
                return;
        }
    }
}
