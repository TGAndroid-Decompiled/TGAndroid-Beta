package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f38233a;
    public final ek0 f38234b;

    public wj0(ek0 ek0Var, int i10) {
        this.f38233a = i10;
        this.f38234b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f38233a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38234b.f32229b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38234b.d.getEditText());
                return;
        }
    }
}
