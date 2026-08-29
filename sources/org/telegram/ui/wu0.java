package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wu0 implements Runnable {
    public final int f44383a;
    public final iv0 f44384b;

    public wu0(iv0 iv0Var, int i10) {
        this.f44383a = i10;
        this.f44384b = iv0Var;
    }

    @Override
    public final void run() {
        switch (this.f44383a) {
            case 0:
                iv0 iv0Var = this.f44384b;
                AndroidUtilities.runOnUIThread(new wu0(iv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = iv0Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = iv0Var.H;
                    s1Var2.H7 = null;
                    s1Var2.invalidate();
                }
                pm pmVar = iv0Var.f39342a0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    iv0Var.f39342a0 = null;
                    return;
                }
                return;
            case 1:
                this.f44384b.c(false);
                return;
            case 2:
                this.f44384b.c(false);
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }

    public wu0(iv0 iv0Var, boolean z10) {
        this.f44383a = 0;
        this.f44384b = iv0Var;
    }
}
