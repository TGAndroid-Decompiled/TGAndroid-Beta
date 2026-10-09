package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class we1 implements Runnable {
    public final int f43209a;
    public final bf1 f43210b;

    public we1(bf1 bf1Var, int i10) {
        this.f43209a = i10;
        this.f43210b = bf1Var;
    }

    @Override
    public final void run() {
        switch (this.f43209a) {
            case 0:
                bf1 bf1Var = this.f43210b;
                bf1Var.getClass();
                new rg.y0((org.telegram.ui.ActionBar.n2) bf1Var, 11, false).show();
                return;
            default:
                bf1 bf1Var2 = this.f43210b;
                bf1Var2.f36298e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.f36298e);
                return;
        }
    }
}
