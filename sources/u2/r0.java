package u2;
public final class r0 implements Runnable {
    public final int f47877a;
    public final y0 f47878b;

    public r0(y0 y0Var, int i10) {
        this.f47877a = i10;
        this.f47878b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f47877a) {
            case 0:
                this.f47878b.f47928b0 = true;
                return;
            case 1:
                this.f47878b.w();
                return;
            default:
                y0 y0Var = this.f47878b;
                if (!y0Var.f47936h0) {
                    e0 e0Var = y0Var.I;
                    e0Var.getClass();
                    e0Var.b(y0Var);
                    return;
                }
                return;
        }
    }
}
