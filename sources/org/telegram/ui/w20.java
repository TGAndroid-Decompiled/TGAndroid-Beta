package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w20 implements DialogInterface.OnShowListener {
    public final int f50679a;
    public final org.telegram.ui.ActionBar.s1 f50680b;
    public final EditTextBoldCursor f50681c;
    public final Object d;

    public w20(Object obj, org.telegram.ui.ActionBar.s1 s1Var, EditTextBoldCursor editTextBoldCursor, int i3) {
        this.f50679a = i3;
        this.d = obj;
        this.f50680b = s1Var;
        this.f50681c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f50679a) {
            case 0:
                ((c30) this.d).f44213b.u1(null, this.f50680b, this.f50681c, true);
                return;
            default:
                ((x20) this.d).f51696p1.f44213b.u1(null, this.f50680b, this.f50681c, true);
                return;
        }
    }
}
