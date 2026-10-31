package vh;
public final class t0 implements Runnable {
    public final int f51949a;
    public final u0 f51950b;

    public t0(u0 u0Var, int i10) {
        this.f51949a = i10;
        this.f51950b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f51949a) {
            case 0:
                u0 u0Var = this.f51950b;
                if (u0Var.K > 0) {
                    u0Var.dualToggleShape();
                    try {
                        u0Var.performHapticFeedback(0, 1);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                u0 u0Var2 = this.f51950b;
                u0Var2.focusToPoint((int) u0Var2.I, (int) u0Var2.J);
                return;
        }
    }
}
