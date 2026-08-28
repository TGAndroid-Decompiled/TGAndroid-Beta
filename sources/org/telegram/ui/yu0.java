package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yu0 implements Runnable {
    public final int f44953a;
    public final iv0 f44954b;

    public yu0(iv0 iv0Var, int i9) {
        this.f44953a = i9;
        this.f44954b = iv0Var;
    }

    @Override
    public final void run() {
        switch (this.f44953a) {
            case 0:
                iv0 iv0Var = this.f44954b;
                AndroidUtilities.runOnUIThread(new yu0(iv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = iv0Var.H;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = iv0Var.H;
                    t1Var2.H7 = null;
                    t1Var2.invalidate();
                }
                nm nmVar = iv0Var.f39296a0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    iv0Var.f39296a0 = null;
                    return;
                }
                return;
            case 1:
                this.f44954b.c(false);
                return;
            case 2:
                this.f44954b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public yu0(iv0 iv0Var, boolean z10) {
        this.f44953a = 0;
        this.f44954b = iv0Var;
    }
}
