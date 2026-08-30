package vh;
public final class y0 implements Runnable {
    public final int f46287a;
    public final d1 f46288b;

    public y0(d1 d1Var, int i10) {
        this.f46287a = i10;
        this.f46288b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f46287a) {
            case 0:
                d1 d1Var = this.f46288b;
                e4 e4Var = d1Var.O;
                if (e4Var != null && d1Var.d != null) {
                    d1Var.P = true;
                    e4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((n2) d1Var.d).a(d1Var, d1Var.O, true);
                    return;
                }
                return;
            case 1:
                this.f46288b.n();
                return;
            default:
                this.f46288b.s();
                return;
        }
    }
}
