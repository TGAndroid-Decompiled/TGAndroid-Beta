package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ve1 implements Runnable {
    public final int f43000a;
    public final af1 f43001b;

    public ve1(af1 af1Var, int i10) {
        this.f43000a = i10;
        this.f43001b = af1Var;
    }

    @Override
    public final void run() {
        switch (this.f43000a) {
            case 0:
                af1 af1Var = this.f43001b;
                af1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.m2) af1Var, 11, false).show();
                return;
            default:
                af1 af1Var2 = this.f43001b;
                af1Var2.f36057e.requestFocus();
                AndroidUtilities.showKeyboard(af1Var2.f36057e);
                return;
        }
    }
}
