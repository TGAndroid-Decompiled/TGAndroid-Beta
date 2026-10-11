package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ve1 implements Runnable {
    public final int f43034a;
    public final af1 f43035b;

    public ve1(af1 af1Var, int i10) {
        this.f43034a = i10;
        this.f43035b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f43034a) {
            case 0:
                af1 af1Var = this.f43035b;
                af1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.m2) af1Var, 11, false).show();
                return;
            default:
                af1 af1Var2 = this.f43035b;
                af1Var2.f36091e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.f36091e);
                return;
        }
    }
}
