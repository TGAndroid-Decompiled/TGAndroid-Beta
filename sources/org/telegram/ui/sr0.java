package org.telegram.ui;
public final class sr0 implements Runnable {
    public final int f49979a;
    public final bs0 f49980b;

    public sr0(bs0 bs0Var, int i7) {
        this.f49979a = i7;
        this.f49980b = bs0Var;
    }

    @Override
    public final void run() {
        switch (this.f49979a) {
            case 0:
                bs0 bs0Var = this.f49980b;
                org.telegram.messenger.g0.h3(new sr0(bs0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = bs0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = bs0Var.L;
                    q1Var2.f29806c6 = null;
                    q1Var2.invalidate();
                }
                vl vlVar = bs0Var.f44119e0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    bs0Var.f44119e0 = null;
                    return;
                }
                return;
            case 1:
                this.f49980b.c(false);
                return;
            case 2:
                this.f49980b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public sr0(bs0 bs0Var, boolean z9) {
        this.f49979a = 0;
        this.f49980b = bs0Var;
    }
}
