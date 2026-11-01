package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z30 implements DialogInterface.OnShowListener {
    public final int f43806a;
    public final org.telegram.ui.ActionBar.x1 f43807b;
    public final EditTextBoldCursor f43808c;
    public final Object d;

    public z30(Object obj, org.telegram.ui.ActionBar.x1 x1Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f43806a = i10;
        this.d = obj;
        this.f43807b = x1Var;
        this.f43808c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43806a) {
            case 0:
                ((e40) this.d).f36726b.u1(null, this.f43807b, this.f43808c, true);
                return;
            default:
                ((a40) this.d).f35559o1.f36726b.u1(null, this.f43807b, this.f43808c, true);
                return;
        }
    }
}
