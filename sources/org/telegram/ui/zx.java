package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class zx implements org.telegram.ui.ActionBar.r1 {
    public final int f52689a;
    public final EditTextBoldCursor f52690b;

    public zx(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f52689a = i7;
        this.f52690b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52689a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f52690b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f52690b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f52690b);
                return;
        }
    }
}
