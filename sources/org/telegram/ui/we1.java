package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class we1 implements Runnable {
    public final int f38808a;
    public final bf1 f38809b;

    public we1(bf1 bf1Var, int i10) {
        this.f38808a = i10;
        this.f38809b = bf1Var;
    }

    @Override
    public final void run() {
        switch (this.f38808a) {
            case 0:
                bf1 bf1Var = this.f38809b;
                bf1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) bf1Var, 11, false).show();
                return;
            default:
                bf1 bf1Var2 = this.f38809b;
                bf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.e);
                return;
        }
    }
}
