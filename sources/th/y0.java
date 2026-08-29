package th;
public final class y0 implements Runnable {
    public final int f48897a;
    public final d1 f48898b;

    public y0(d1 d1Var, int i10) {
        this.f48897a = i10;
        this.f48898b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f48897a) {
            case 0:
                d1 d1Var = this.f48898b;
                c4 c4Var = d1Var.N;
                if (c4Var != null && d1Var.d != null) {
                    d1Var.O = true;
                    c4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((m2) d1Var.d).a(d1Var, d1Var.N, true);
                    return;
                }
                return;
            case 1:
                this.f48898b.n();
                return;
            default:
                this.f48898b.s();
                return;
        }
    }
}
