package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f44027a;
    public final ek0 f44028b;

    public xj0(ek0 ek0Var, int i10) {
        this.f44027a = i10;
        this.f44028b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f44027a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f44028b.f37165b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f44028b.d.getEditText());
                return;
        }
    }
}
