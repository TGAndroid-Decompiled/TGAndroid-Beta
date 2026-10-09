package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class we1 implements Runnable {
    public final int f43211a;
    public final bf1 f43212b;

    public we1(bf1 bf1Var, int i10) {
        this.f43211a = i10;
        this.f43212b = bf1Var;
    }

    @Override
    public final void run() {
        switch (this.f43211a) {
            case 0:
                bf1 bf1Var = this.f43212b;
                bf1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) bf1Var, 11, false).show();
                return;
            default:
                bf1 bf1Var2 = this.f43212b;
                bf1Var2.f36300e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.f36300e);
                return;
        }
    }
}
