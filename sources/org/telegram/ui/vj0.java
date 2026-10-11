package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vj0 implements Runnable {
    public final int f43105a;
    public final ck0 f43106b;

    public vj0(ck0 ck0Var, int i10) {
        this.f43105a = i10;
        this.f43106b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f43105a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f43106b.f36800b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f43106b.d.getEditText());
                return;
        }
    }
}
