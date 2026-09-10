package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ze1 implements Runnable {
    public final int f39272a;
    public final ef1 f39273b;

    public ze1(ef1 ef1Var, int i10) {
        this.f39272a = i10;
        this.f39273b = ef1Var;
    }

    @Override
    public final void run() {
        switch (this.f39272a) {
            case 0:
                ef1 ef1Var = this.f39273b;
                ef1Var.getClass();
                new qg.a1((org.telegram.ui.ActionBar.p2) ef1Var, 11, false).show();
                return;
            default:
                ef1 ef1Var2 = this.f39273b;
                ef1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ef1Var2.e);
                return;
        }
    }
}
