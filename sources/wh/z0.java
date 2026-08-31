package wh;
public final class z0 implements Runnable {
    public final int f50179a;
    public final e1 f50180b;

    public z0(e1 e1Var, int i10) {
        this.f50179a = i10;
        this.f50180b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f50179a) {
            case 0:
                e1 e1Var = this.f50180b;
                e4 e4Var = e1Var.O;
                if (e4Var != null && e1Var.d != null) {
                    e1Var.P = true;
                    e4Var.b().setPressed(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((o2) e1Var.d).a(e1Var, e1Var.O, true);
                    return;
                }
                return;
            case 1:
                this.f50180b.n();
                return;
            default:
                this.f50180b.s();
                return;
        }
    }
}
