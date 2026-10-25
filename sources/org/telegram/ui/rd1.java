package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rd1 implements Runnable {
    public final int f43118a;
    public final wd1 f43119b;

    public rd1(wd1 wd1Var, int i10) {
        this.f43118a = i10;
        this.f43119b = wd1Var;
    }

    @Override
    public final void run() {
        switch (this.f43118a) {
            case 0:
                wd1 wd1Var = this.f43119b;
                wd1Var.getClass();
                new tg.y0((org.telegram.ui.ActionBar.r2) wd1Var, 11, false).show();
                return;
            default:
                wd1 wd1Var2 = this.f43119b;
                wd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(wd1Var2.e);
                return;
        }
    }
}
