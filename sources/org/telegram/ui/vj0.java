package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vj0 implements Runnable {
    public final int f38638a;
    public final ck0 f38639b;

    public vj0(ck0 ck0Var, int i10) {
        this.f38638a = i10;
        this.f38639b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f38638a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38639b.f32810b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38639b.d.getEditText());
                return;
        }
    }
}
