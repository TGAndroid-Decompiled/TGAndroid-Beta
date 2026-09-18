package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f39182a;
    public final ek0 f39183b;

    public wj0(ek0 ek0Var, int i10) {
        this.f39182a = i10;
        this.f39183b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f39182a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39183b.f33305b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39183b.d.getEditText());
                return;
        }
    }
}
