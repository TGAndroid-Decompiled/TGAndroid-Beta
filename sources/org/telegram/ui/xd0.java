package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class xd0 implements Runnable {
    public final int f43357a;
    public final yd0 f43358b;

    public xd0(yd0 yd0Var, int i10) {
        this.f43357a = i10;
        this.f43358b = yd0Var;
    }

    @Override
    public final void run() {
        switch (this.f43357a) {
            case 0:
                yd0 yd0Var = this.f43358b;
                org.telegram.ui.Components.fi0 fi0Var = yd0Var.h;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                EditTextBoldCursor editTextBoldCursor = yd0Var.f43641b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                return;
            default:
                this.f43358b.f43641b.requestFocus();
                return;
        }
    }
}
