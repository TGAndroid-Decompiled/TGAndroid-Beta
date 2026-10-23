package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class we0 implements Runnable {
    public final int f43016a;
    public final ye0 f43017b;

    public we0(ye0 ye0Var, int i10) {
        this.f43016a = i10;
        this.f43017b = ye0Var;
    }

    @Override
    public final void run() {
        switch (this.f43016a) {
            case 0:
                ye0 ye0Var = this.f43017b;
                org.telegram.ui.Components.bk0 bk0Var = ye0Var.h;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                EditTextBoldCursor editTextBoldCursor = ye0Var.f43782b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f43017b.f43782b.requestFocus();
                return;
        }
    }
}
