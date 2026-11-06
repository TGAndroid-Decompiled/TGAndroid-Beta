package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 implements Runnable {
    public final int f49482a;
    public final sc0 f49483b;

    public rc0(sc0 sc0Var, int i7) {
        this.f49482a = i7;
        this.f49483b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49482a) {
            case 0:
                sc0 sc0Var = this.f49483b;
                org.telegram.ui.Components.ch0 ch0Var = sc0Var.h;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.f49738b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            default:
                this.f49483b.f49738b.requestFocus();
                return;
        }
    }
}
