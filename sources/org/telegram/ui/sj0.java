package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sj0 implements Runnable {
    public final int f40514a;
    public final ak0 f40515b;

    public sj0(ak0 ak0Var, int i10) {
        this.f40514a = i10;
        this.f40515b = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f40514a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40515b.f34840b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f40515b.d.getEditText());
                return;
        }
    }
}
