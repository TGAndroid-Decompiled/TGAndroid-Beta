package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t40 implements DialogInterface.OnShowListener {
    public final int f43677a;
    public final org.telegram.ui.ActionBar.e2 f43678b;
    public final EditTextBoldCursor f43679c;
    public final Object d;

    public t40(Object obj, org.telegram.ui.ActionBar.e2 e2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f43677a = i10;
        this.d = obj;
        this.f43678b = e2Var;
        this.f43679c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43677a) {
            case 0:
                ((y40) this.d).f45954b.s1(null, this.f43678b, this.f43679c, true);
                return;
            default:
                ((u40) this.d).f44012n.f45954b.s1(null, this.f43678b, this.f43679c, true);
                return;
        }
    }
}
