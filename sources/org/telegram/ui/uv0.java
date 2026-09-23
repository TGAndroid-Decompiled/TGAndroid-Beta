package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class uv0 implements Runnable {
    public final int f38226a;
    public final fw0 f38227b;

    public uv0(fw0 fw0Var, int i10) {
        this.f38226a = i10;
        this.f38227b = fw0Var;
    }

    @Override
    public final void run() {
        switch (this.f38226a) {
            case 0:
                fw0 fw0Var = this.f38227b;
                AndroidUtilities.runOnUIThread(new uv0(fw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = fw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = fw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                um umVar = fw0Var.f33378e0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    fw0Var.f33378e0 = null;
                    return;
                }
                return;
            case 1:
                this.f38227b.c(false);
                return;
            case 2:
                this.f38227b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public uv0(fw0 fw0Var, boolean z10) {
        this.f38226a = 0;
        this.f38227b = fw0Var;
    }
}
