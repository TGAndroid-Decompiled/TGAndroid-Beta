package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class yd0 implements Runnable {
    public final int f43820a;
    public final zd0 f43821b;

    public yd0(zd0 zd0Var, int i10) {
        this.f43820a = i10;
        this.f43821b = zd0Var;
    }

    @Override
    public final void run() {
        switch (this.f43820a) {
            case 0:
                zd0 zd0Var = this.f43821b;
                org.telegram.ui.Components.ei0 ei0Var = zd0Var.h;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                EditTextBoldCursor editTextBoldCursor = zd0Var.f44127b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                return;
            default:
                this.f43821b.f44127b.requestFocus();
                return;
        }
    }
}
