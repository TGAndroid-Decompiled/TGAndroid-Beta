package rh;

public final class y0 implements Runnable {

    public final int f47599a;

    public final d1 f47600b;

    public y0(d1 d1Var, int i10) {
        this.f47599a = i10;
        this.f47600b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f47599a) {
            case 0:
                d1 d1Var = this.f47600b;
                c4 c4Var = d1Var.N;
                if (c4Var != null && d1Var.d != null) {
                    d1Var.O = true;
                    c4Var.b().setPressed(false);
                    try {
                        d1Var.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    ((m2) d1Var.d).a(d1Var, d1Var.N, true);
                    break;
                }
                break;
            case 1:
                this.f47600b.n();
                break;
            default:
                this.f47600b.s();
                break;
        }
    }
}
