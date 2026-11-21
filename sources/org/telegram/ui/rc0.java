package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 implements Runnable {
    public final int f51540a;
    public final sc0 f51541b;

    public rc0(sc0 sc0Var, int i7) {
        this.f51540a = i7;
        this.f51541b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f51540a) {
            case 0:
                sc0 sc0Var = this.f51541b;
                org.telegram.ui.Components.rh0 rh0Var = sc0Var.h;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.f52006b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            default:
                this.f51541b.f52006b.requestFocus();
                return;
        }
    }
}
