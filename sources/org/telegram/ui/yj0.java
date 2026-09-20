package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yj0 implements Runnable {
    public final int f39950a;
    public final fk0 f39951b;

    public yj0(fk0 fk0Var, int i10) {
        this.f39950a = i10;
        this.f39951b = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f39950a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f39951b.f33674b);
                return;
            default:
                AndroidUtilities.showKeyboard(this.f39951b.d.getEditText());
                return;
        }
    }
}
