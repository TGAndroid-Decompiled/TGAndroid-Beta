package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class re0 implements Runnable {
    public final int f40710a;
    public final te0 f40711b;

    public re0(te0 te0Var, int i10) {
        this.f40710a = i10;
        this.f40711b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f40710a) {
            case 0:
                te0 te0Var = this.f40711b;
                org.telegram.ui.Components.xj0 xj0Var = te0Var.h;
                xj0Var.getAnimatedDrawable().N(0, false, false);
                xj0Var.d();
                EditTextBoldCursor editTextBoldCursor = te0Var.f41669b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f40711b.f41669b.requestFocus();
                return;
        }
    }
}
