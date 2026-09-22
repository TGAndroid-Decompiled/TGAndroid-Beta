package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vj0 implements Runnable {
    public final int f38574a;
    public final ck0 f38575b;

    public vj0(ck0 ck0Var, int i10) {
        this.f38574a = i10;
        this.f38575b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f38574a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f38575b.f32817b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f38575b.d.getEditText());
                return;
        }
    }
}
