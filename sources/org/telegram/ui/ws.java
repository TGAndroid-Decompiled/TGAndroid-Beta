package org.telegram.ui;
public final class ws implements Runnable {
    public final int f43158a;
    public final kt f43159b;

    public ws(kt ktVar, int i10) {
        this.f43158a = i10;
        this.f43159b = ktVar;
    }

    @Override
    public final void run() {
        switch (this.f43158a) {
            case 0:
                this.f43159b.f38978c0 = null;
                return;
            case 1:
                kt ktVar = this.f43159b;
                ktVar.A.w0(null);
                org.telegram.ui.Components.lc0 lc0Var = ktVar.C;
                if (lc0Var != null) {
                    lc0Var.a();
                    ktVar.f38999z.removeView(ktVar.C);
                    ktVar.C = null;
                    return;
                }
                return;
            default:
                this.f43159b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                return;
        }
    }
}
