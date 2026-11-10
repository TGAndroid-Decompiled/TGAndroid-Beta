package org.telegram.ui;
public final class tr0 implements Runnable {
    public final int f50328a;
    public final cs0 f50329b;

    public tr0(cs0 cs0Var, int i7) {
        this.f50328a = i7;
        this.f50329b = cs0Var;
    }

    @Override
    public final void run() {
        switch (this.f50328a) {
            case 0:
                cs0 cs0Var = this.f50329b;
                org.telegram.messenger.g0.h3(new tr0(cs0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = cs0Var.L;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = cs0Var.L;
                    q1Var2.f29817c6 = null;
                    q1Var2.invalidate();
                }
                vl vlVar = cs0Var.f44791e0;
                if (vlVar != null) {
                    org.telegram.messenger.g0.h3(vlVar);
                    cs0Var.f44791e0 = null;
                    return;
                }
                return;
            case 1:
                this.f50329b.c(false);
                return;
            case 2:
                this.f50329b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public tr0(cs0 cs0Var, boolean z9) {
        this.f50328a = 0;
        this.f50329b = cs0Var;
    }
}
