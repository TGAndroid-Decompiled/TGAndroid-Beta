package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 implements Runnable {
    public final int f51551a;
    public final sc0 f51552b;

    public rc0(sc0 sc0Var, int i7) {
        this.f51551a = i7;
        this.f51552b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f51551a) {
            case 0:
                sc0 sc0Var = this.f51552b;
                org.telegram.ui.Components.ph0 ph0Var = sc0Var.h;
                ph0Var.getAnimatedDrawable().N(0, false, false);
                ph0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.f51966b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                return;
            default:
                this.f51552b.f51966b.requestFocus();
                return;
        }
    }
}
