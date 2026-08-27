package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ve0 implements Runnable {

    public final int f43437a;

    public final xe0 f43438b;

    public ve0(xe0 xe0Var, int i10) {
        this.f43437a = i10;
        this.f43438b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f43437a) {
            case 0:
                xe0 xe0Var = this.f43438b;
                org.telegram.ui.Components.ri0 ri0Var = xe0Var.h;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                EditTextBoldCursor editTextBoldCursor = xe0Var.f44426b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.f43438b.f44426b.requestFocus();
                break;
        }
    }
}
