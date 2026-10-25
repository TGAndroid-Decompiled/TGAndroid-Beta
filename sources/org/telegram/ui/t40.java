package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t40 implements DialogInterface.OnShowListener {
    public final int f43674a;
    public final org.telegram.ui.ActionBar.e2 f43675b;
    public final EditTextBoldCursor f43676c;
    public final Object d;

    public t40(Object obj, org.telegram.ui.ActionBar.e2 e2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f43674a = i10;
        this.d = obj;
        this.f43675b = e2Var;
        this.f43676c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f43674a) {
            case 0:
                ((y40) this.d).f45951b.s1(null, this.f43675b, this.f43676c, true);
                return;
            default:
                ((u40) this.d).f44009n.f45951b.s1(null, this.f43675b, this.f43676c, true);
                return;
        }
    }
}
