package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class se0 implements Runnable {
    public final int f42674a;
    public final ue0 f42675b;

    public se0(ue0 ue0Var, int i9) {
        this.f42674a = i9;
        this.f42675b = ue0Var;
    }

    @Override
    public final void run() {
        switch (this.f42674a) {
            case 0:
                ue0 ue0Var = this.f42675b;
                org.telegram.ui.Components.pi0 pi0Var = ue0Var.h;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                EditTextBoldCursor editTextBoldCursor = ue0Var.f43229b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f42675b.f43229b.requestFocus();
                return;
        }
    }
}
