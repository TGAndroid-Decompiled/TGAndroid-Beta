package ph;
public final class u0 implements Runnable {
    public final int f42379a;
    public final v0 f42380b;

    public u0(v0 v0Var, int i10) {
        this.f42379a = i10;
        this.f42380b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f42379a) {
            case 0:
                v0 v0Var = this.f42380b;
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
                v0 v0Var2 = this.f42380b;
                v0Var2.focusToPoint((int) v0Var2.F, (int) v0Var2.G);
                return;
        }
    }
}
