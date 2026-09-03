package vh;
public final class z0 implements Runnable {
    public final int f46418a;
    public final e1 f46419b;

    public z0(e1 e1Var, int i10) {
        this.f46418a = i10;
        this.f46419b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f46418a) {
            case 0:
                e1 e1Var = this.f46419b;
                f4 f4Var = e1Var.O;
                if (f4Var != null && e1Var.d != null) {
                    e1Var.P = true;
                    f4Var.b().setPressed(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((o2) e1Var.d).a(e1Var, e1Var.O, true);
                    return;
                }
                return;
            case 1:
                this.f46419b.n();
                return;
            default:
                this.f46419b.s();
                return;
        }
    }
}
