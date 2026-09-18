package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class we1 implements Runnable {
    public final int f38701a;
    public final bf1 f38702b;

    public we1(bf1 bf1Var, int i10) {
        this.f38701a = i10;
        this.f38702b = bf1Var;
    }

    @Override
    public final void run() {
        switch (this.f38701a) {
            case 0:
                bf1 bf1Var = this.f38702b;
                bf1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.o2) bf1Var, 11, false).show();
                return;
            default:
                bf1 bf1Var2 = this.f38702b;
                bf1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(bf1Var2.e);
                return;
        }
    }
}
