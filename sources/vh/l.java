package vh;
public final class l implements Runnable {
    public final int f51456a;
    public final e8 f51457b;

    public l(e8 e8Var, int i10) {
        this.f51456a = i10;
        this.f51457b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f51456a) {
            case 0:
                this.f51457b.n();
                return;
            case 1:
                e8 e8Var = this.f51457b;
                e8Var.J0 = false;
                e8Var.K0 = Integer.MIN_VALUE;
                e8Var.invalidate();
                e8Var.R0.setVisibility(0);
                e8Var.S0.setVisibility(0);
                return;
            default:
                o8 o8Var = this.f51457b.R1;
                d8 d8Var = o8Var.X0;
                if (d8Var != null) {
                    d8Var.O = false;
                    d8Var.c();
                    d8 d8Var2 = o8Var.X0;
                    d8Var2.m(0L);
                    z8 z8Var = d8Var2.F;
                    if (z8Var != null) {
                        z8Var.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
