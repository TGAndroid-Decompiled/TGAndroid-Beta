package qh;
public final class l implements Runnable {
    public final int f45635a;
    public final q9 f45636b;

    public l(q9 q9Var, int i10) {
        this.f45635a = i10;
        this.f45636b = q9Var;
    }

    @Override
    public final void run() {
        switch (this.f45635a) {
            case 0:
                this.f45636b.n();
                return;
            case 1:
                q9 q9Var = this.f45636b;
                q9Var.H0 = false;
                q9Var.I0 = Integer.MIN_VALUE;
                q9Var.invalidate();
                q9Var.P0.setVisibility(0);
                q9Var.Q0.setVisibility(0);
                return;
            default:
                ba baVar = this.f45636b.P1;
                p9 p9Var = baVar.U0;
                if (p9Var != null) {
                    p9Var.L = false;
                    p9Var.c();
                    p9 p9Var2 = baVar.U0;
                    p9Var2.m(0L);
                    la laVar = p9Var2.C;
                    if (laVar != null) {
                        laVar.setProgress(0L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
