package qh;
public final class y0 implements Runnable {
    public final int f46839a;
    public final d1 f46840b;

    public y0(d1 d1Var, int i9) {
        this.f46839a = i9;
        this.f46840b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f46839a) {
            case 0:
                d1 d1Var = this.f46840b;
                b4 b4Var = d1Var.N;
                if (b4Var != null && d1Var.d != null) {
                    d1Var.O = true;
                    b4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((m2) d1Var.d).a(d1Var, d1Var.N, true);
                    return;
                }
                return;
            case 1:
                this.f46840b.n();
                return;
            default:
                this.f46840b.s();
                return;
        }
    }
}
