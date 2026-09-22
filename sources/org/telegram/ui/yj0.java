package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yj0 implements Runnable {
    public final int f39972a;
    public final fk0 f39973b;

    public yj0(fk0 fk0Var, int i10) {
        this.f39972a = i10;
        this.f39973b = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f39972a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39973b.f33700b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39973b.d.getEditText());
                return;
        }
    }
}
