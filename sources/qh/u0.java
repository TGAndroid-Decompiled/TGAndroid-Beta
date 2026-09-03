package qh;
public final class u0 implements Runnable {
    public final int f46154a;
    public final v0 f46155b;

    public u0(v0 v0Var, int i10) {
        this.f46154a = i10;
        this.f46155b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f46154a) {
            case 0:
                v0 v0Var = this.f46155b;
                if (v0Var.H > 0) {
                    v0Var.dualToggleShape();
                    try {
                        v0Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                v0 v0Var2 = this.f46155b;
                v0Var2.focusToPoint((int) v0Var2.F, (int) v0Var2.G);
                return;
        }
    }
}
