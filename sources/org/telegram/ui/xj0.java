package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f39662a;
    public final ek0 f39663b;

    public xj0(ek0 ek0Var, int i10) {
        this.f39662a = i10;
        this.f39663b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f39662a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39663b.f33428b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39663b.d.getEditText());
                return;
        }
    }
}
