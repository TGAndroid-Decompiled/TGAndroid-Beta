package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class tc0 implements Runnable {
    public final int f50156a;
    public final uc0 f50157b;

    public tc0(uc0 uc0Var, int i7) {
        this.f50156a = i7;
        this.f50157b = uc0Var;
    }

    @Override
    public final void run() {
        switch (this.f50156a) {
            case 0:
                uc0 uc0Var = this.f50157b;
                org.telegram.ui.Components.dh0 dh0Var = uc0Var.h;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                EditTextBoldCursor editTextBoldCursor = uc0Var.f50366b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                return;
            default:
                this.f50157b.f50366b.requestFocus();
                return;
        }
    }
}
