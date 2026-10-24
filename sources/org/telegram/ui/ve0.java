package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ve0 implements Runnable {
    public final int f42710a;
    public final xe0 f42711b;

    public ve0(xe0 xe0Var, int i10) {
        this.f42710a = i10;
        this.f42711b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f42710a) {
            case 0:
                xe0 xe0Var = this.f42711b;
                org.telegram.ui.Components.ak0 ak0Var = xe0Var.h;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                EditTextBoldCursor editTextBoldCursor = xe0Var.f43535b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f42711b.f43535b.requestFocus();
                return;
        }
    }
}
