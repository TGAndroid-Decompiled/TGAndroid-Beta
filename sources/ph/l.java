package ph;
public final class l implements Runnable {
    public final int f41935a;
    public final t9 f41936b;

    public l(t9 t9Var, int i10) {
        this.f41935a = i10;
        this.f41936b = t9Var;
    }

    @Override
    public final void run() {
        switch (this.f41935a) {
            case 0:
                this.f41936b.n();
                return;
            case 1:
                t9 t9Var = this.f41936b;
                t9Var.H0 = false;
                t9Var.I0 = Integer.MIN_VALUE;
                t9Var.invalidate();
                t9Var.P0.setVisibility(0);
                t9Var.Q0.setVisibility(0);
                return;
            default:
                da daVar = this.f41936b.P1;
                s9 s9Var = daVar.U0;
                if (s9Var != null) {
                    s9Var.L = false;
                    s9Var.c();
                    s9 s9Var2 = daVar.U0;
                    s9Var2.m(0L);
                    oa oaVar = s9Var2.C;
                    if (oaVar != null) {
                        oaVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
