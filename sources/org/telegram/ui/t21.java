package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class t21 implements Runnable {

    public final int f42765a;

    public final w21 f42766b;

    public t21(w21 w21Var, int i10) {
        this.f42765a = i10;
        this.f42766b = w21Var;
    }

    @Override
    public final void run() {
        switch (this.f42765a) {
            case 0:
                w21 w21Var = this.f42766b;
                x21 x21Var = w21Var.v;
                if (w21Var.f43581a != 0) {
                    x21Var.onBackPressed();
                } else {
                    x21Var.dismiss();
                }
                break;
            default:
                AndroidUtilities.showKeyboard(this.f42766b.f43586n.f24370b);
                break;
        }
    }
}
