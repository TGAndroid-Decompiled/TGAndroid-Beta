package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 implements Runnable {
    public final int f49468a;
    public final sc0 f49469b;

    public rc0(sc0 sc0Var, int i7) {
        this.f49468a = i7;
        this.f49469b = sc0Var;
    }

    @Override
    public final void run() {
        switch (this.f49468a) {
            case 0:
                sc0 sc0Var = this.f49469b;
                org.telegram.ui.Components.ch0 ch0Var = sc0Var.h;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                EditTextBoldCursor editTextBoldCursor = sc0Var.f49721b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            default:
                this.f49469b.f49721b.requestFocus();
                return;
        }
    }
}
