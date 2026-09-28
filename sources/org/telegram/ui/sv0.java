package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sv0 implements Runnable {
    public final int f37874a;
    public final dw0 f37875b;

    public sv0(dw0 dw0Var, int i10) {
        this.f37874a = i10;
        this.f37875b = dw0Var;
    }

    @Override
    public final void run() {
        switch (this.f37874a) {
            case 0:
                dw0 dw0Var = this.f37875b;
                AndroidUtilities.runOnUIThread(new sv0(dw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = dw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = dw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                tm tmVar = dw0Var.f33209e0;
                if (tmVar != null) {
                    AndroidUtilities.runOnUIThread(tmVar);
                    dw0Var.f33209e0 = null;
                    return;
                }
                return;
            case 1:
                this.f37875b.c(false);
                return;
            case 2:
                this.f37875b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public sv0(dw0 dw0Var, boolean z10) {
        this.f37874a = 0;
        this.f37875b = dw0Var;
    }
}
