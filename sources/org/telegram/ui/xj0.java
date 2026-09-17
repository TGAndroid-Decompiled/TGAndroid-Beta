package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f42776a;
    public final ek0 f42777b;

    public xj0(ek0 ek0Var, int i10) {
        this.f42776a = i10;
        this.f42777b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f42776a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42777b.f36133b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f42777b.d.getEditText());
                return;
        }
    }
}
