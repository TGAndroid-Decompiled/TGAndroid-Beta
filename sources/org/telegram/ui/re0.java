package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class re0 implements Runnable {
    public final int f42081a;
    public final te0 f42082b;

    public re0(te0 te0Var, int i10) {
        this.f42081a = i10;
        this.f42082b = te0Var;
    }

    @Override
    public final void run() {
        switch (this.f42081a) {
            case 0:
                te0 te0Var = this.f42082b;
                org.telegram.ui.Components.aj0 aj0Var = te0Var.h;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                EditTextBoldCursor editTextBoldCursor = te0Var.f42675b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f42082b.f42675b.requestFocus();
                return;
        }
    }
}
