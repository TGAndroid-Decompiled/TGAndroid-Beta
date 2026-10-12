package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f44032a;
    public final ek0 f44033b;

    public xj0(ek0 ek0Var, int i10) {
        this.f44032a = i10;
        this.f44033b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f44032a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44033b.f37170b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f44033b.d.getEditText());
                return;
        }
    }
}
