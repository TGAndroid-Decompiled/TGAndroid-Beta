package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class td1 implements Runnable {
    public final int f43605a;
    public final yd1 f43606b;

    public td1(yd1 yd1Var, int i10) {
        this.f43605a = i10;
        this.f43606b = yd1Var;
    }

    @Override
    public final void run() {
        switch (this.f43605a) {
            case 0:
                yd1 yd1Var = this.f43606b;
                yd1Var.getClass();
                new tg.y0((org.telegram.ui.ActionBar.r2) yd1Var, 11, false).show();
                return;
            default:
                yd1 yd1Var2 = this.f43606b;
                yd1Var2.e.requestFocus();
                AndroidUtilities.showKeyboard(yd1Var2.e);
                return;
        }
    }
}
