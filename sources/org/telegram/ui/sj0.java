package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sj0 implements Runnable {
    public final int f40533a;
    public final ak0 f40534b;

    public sj0(ak0 ak0Var, int i10) {
        this.f40533a = i10;
        this.f40534b = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f40533a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40534b.f34897b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f40534b.d.getEditText());
                return;
        }
    }
}
