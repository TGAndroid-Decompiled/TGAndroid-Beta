package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f43695a;
    public final dk0 f43696b;

    public wj0(dk0 dk0Var, int i10) {
        this.f43695a = i10;
        this.f43696b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f43695a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43696b.f37030b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f43696b.d.getEditText());
                return;
        }
    }
}
