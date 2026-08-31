package qh;
public final class l implements Runnable {
    public final int f45618a;
    public final r9 f45619b;

    public l(r9 r9Var, int i10) {
        this.f45618a = i10;
        this.f45619b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f45618a) {
            case 0:
                this.f45619b.n();
                return;
            case 1:
                r9 r9Var = this.f45619b;
                r9Var.H0 = false;
                r9Var.I0 = Integer.MIN_VALUE;
                r9Var.invalidate();
                r9Var.P0.setVisibility(0);
                r9Var.Q0.setVisibility(0);
                return;
            default:
                ca caVar = this.f45619b.P1;
                q9 q9Var = caVar.U0;
                if (q9Var != null) {
                    q9Var.L = false;
                    q9Var.c();
                    q9 q9Var2 = caVar.U0;
                    q9Var2.m(0L);
                    ma maVar = q9Var2.C;
                    if (maVar != null) {
                        maVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
