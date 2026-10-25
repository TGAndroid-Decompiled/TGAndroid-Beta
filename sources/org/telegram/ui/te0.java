package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class te0 implements Runnable {
    public final int f43813a;
    public final ve0 f43814b;

    public te0(ve0 ve0Var, int i10) {
        this.f43813a = i10;
        this.f43814b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f43813a) {
            case 0:
                ve0 ve0Var = this.f43814b;
                org.telegram.ui.Components.ak0 ak0Var = ve0Var.h;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                EditTextBoldCursor editTextBoldCursor = ve0Var.f44779b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f43814b.f44779b.requestFocus();
                return;
        }
    }
}
