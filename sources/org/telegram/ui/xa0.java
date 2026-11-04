package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class xa0 implements Runnable {
    public final int f51900a;
    public final nc0 f51901b;

    public xa0(nc0 nc0Var, int i3) {
        this.f51900a = i3;
        this.f51901b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f51900a) {
            case 0:
                this.f51901b.M.m();
                return;
            case 1:
                nc0 nc0Var = this.f51901b;
                nc0Var.N = null;
                nc0Var.O = null;
                nc0Var.o(true);
                nc0Var.f47959e.j(null, null, nc0Var.f47960f, null);
                xc xcVar = nc0Var.f47961n;
                org.telegram.ui.Components.ch0 ch0Var = nc0Var.J;
                xcVar.setAnimation(ch0Var);
                ch0Var.M(0);
                nc0Var.L = true;
                return;
            case 2:
                this.f51901b.L = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f51901b.f47958c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
