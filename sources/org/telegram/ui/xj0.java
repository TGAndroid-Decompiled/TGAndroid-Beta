package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f42749a;
    public final ek0 f42750b;

    public xj0(ek0 ek0Var, int i10) {
        this.f42749a = i10;
        this.f42750b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f42749a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42750b.f36106b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f42750b.d.getEditText());
                return;
        }
    }
}
