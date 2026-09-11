package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f42748a;
    public final ek0 f42749b;

    public xj0(ek0 ek0Var, int i10) {
        this.f42748a = i10;
        this.f42749b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f42748a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42749b.f36105b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f42749b.d.getEditText());
                return;
        }
    }
}
