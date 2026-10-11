package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vj0 implements Runnable {
    public final int f43071a;
    public final ck0 f43072b;

    public vj0(ck0 ck0Var, int i10) {
        this.f43071a = i10;
        this.f43072b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f43071a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43072b.f36766b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f43072b.d.getEditText());
                return;
        }
    }
}
