package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class zu0 implements Runnable {

    public final int f45260a;

    public final jv0 f45261b;

    public zu0(jv0 jv0Var, int i10) {
        this.f45260a = i10;
        this.f45261b = jv0Var;
    }

    @Override
    public final void run() {
        switch (this.f45260a) {
            case 0:
                jv0 jv0Var = this.f45261b;
                AndroidUtilities.runOnUIThread(new zu0(jv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = jv0Var.H;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = jv0Var.H;
                    s1Var2.H7 = null;
                    s1Var2.invalidate();
                }
                om omVar = jv0Var.f39514a0;
                if (omVar != null) {
                    AndroidUtilities.runOnUIThread(omVar);
                    jv0Var.f39514a0 = null;
                }
                break;
            case 1:
                this.f45261b.c(false);
                break;
            case 2:
                this.f45261b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public zu0(jv0 jv0Var, boolean z10) {
        this.f45260a = 0;
        this.f45261b = jv0Var;
    }
}
