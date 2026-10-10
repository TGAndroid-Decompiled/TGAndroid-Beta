package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f43741a;
    public final dk0 f43742b;

    public wj0(dk0 dk0Var, int i10) {
        this.f43741a = i10;
        this.f43742b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f43741a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43742b.f37076b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f43742b.d.getEditText());
                return;
        }
    }
}
