package vh;
public final class u0 implements Runnable {
    public final int f51998a;
    public final v0 f51999b;

    public u0(v0 v0Var, int i10) {
        this.f51998a = i10;
        this.f51999b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f51998a) {
            case 0:
                v0 v0Var = this.f51999b;
                if (v0Var.K > 0) {
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
                v0 v0Var2 = this.f51999b;
                v0Var2.focusToPoint((int) v0Var2.I, (int) v0Var2.J);
                return;
        }
    }
}
