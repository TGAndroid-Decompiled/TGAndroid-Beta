package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class vx implements org.telegram.ui.ActionBar.p1 {
    public final int f50626a;
    public final EditTextBoldCursor f50627b;

    public vx(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f50626a = i3;
        this.f50627b = editTextBoldCursor;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f50626a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f50627b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f50627b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f50627b);
                return;
        }
    }
}
