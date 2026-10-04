package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sj0 implements Runnable {
    public final int f40521a;
    public final ak0 f40522b;

    public sj0(ak0 ak0Var, int i10) {
        this.f40521a = i10;
        this.f40522b = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f40521a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40522b.f34846b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f40522b.d.getEditText());
                return;
        }
    }
}
