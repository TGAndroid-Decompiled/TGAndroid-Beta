package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class vc0 implements Runnable {
    public final int f50700a;
    public final wc0 f50701b;

    public vc0(wc0 wc0Var, int i7) {
        this.f50700a = i7;
        this.f50701b = wc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50700a) {
            case 0:
                wc0 wc0Var = this.f50701b;
                org.telegram.ui.Components.ch0 ch0Var = wc0Var.h;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                EditTextBoldCursor editTextBoldCursor = wc0Var.f50981b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            default:
                this.f50701b.f50981b.requestFocus();
                return;
        }
    }
}
