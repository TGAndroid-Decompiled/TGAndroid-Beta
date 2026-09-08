package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f42775a;
    public final ek0 f42776b;

    public xj0(ek0 ek0Var, int i10) {
        this.f42775a = i10;
        this.f42776b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f42775a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f42776b.f36132b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f42776b.d.getEditText());
                return;
        }
    }
}
