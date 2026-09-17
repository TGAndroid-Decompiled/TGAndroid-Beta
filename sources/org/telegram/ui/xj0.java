package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f39657a;
    public final ek0 f39658b;

    public xj0(ek0 ek0Var, int i10) {
        this.f39657a = i10;
        this.f39658b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f39657a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39658b.f33424b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39658b.d.getEditText());
                return;
        }
    }
}
