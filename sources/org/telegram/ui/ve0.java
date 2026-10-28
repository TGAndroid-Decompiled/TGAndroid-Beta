package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ve0 implements Runnable {
    public final int f44326a;
    public final xe0 f44327b;

    public ve0(xe0 xe0Var, int i10) {
        this.f44326a = i10;
        this.f44327b = xe0Var;
    }

    @Override
    public final void run() {
        switch (this.f44326a) {
            case 0:
                xe0 xe0Var = this.f44327b;
                org.telegram.ui.Components.bk0 bk0Var = xe0Var.h;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                EditTextBoldCursor editTextBoldCursor = xe0Var.f45664b;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                return;
            default:
                this.f44327b.f45664b.requestFocus();
                return;
        }
    }
}
