package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sj0 implements Runnable {
    public final int f40515a;
    public final ak0 f40516b;

    public sj0(ak0 ak0Var, int i10) {
        this.f40515a = i10;
        this.f40516b = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f40515a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f40516b.f34841b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f40516b.d.getEditText());
                return;
        }
    }
}
