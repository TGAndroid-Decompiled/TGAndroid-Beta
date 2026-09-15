package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ue1 implements Runnable {
    public final int f37989a;
    public final ze1 f37990b;

    public ue1(ze1 ze1Var, int i10) {
        this.f37989a = i10;
        this.f37990b = ze1Var;
    }

    @Override
    public final void run() {
        switch (this.f37989a) {
            case 0:
                ze1 ze1Var = this.f37990b;
                ze1Var.getClass();
                new rg.x0((org.telegram.ui.ActionBar.n2) ze1Var, 11, false).show();
                return;
            default:
                ze1 ze1Var2 = this.f37990b;
                ze1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(ze1Var2.e);
                return;
        }
    }
}
