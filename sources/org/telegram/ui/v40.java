package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v40 implements DialogInterface.OnShowListener {
    public final int f44179a;
    public final org.telegram.ui.ActionBar.e2 f44180b;
    public final EditTextBoldCursor f44181c;
    public final Object d;

    public v40(Object obj, org.telegram.ui.ActionBar.e2 e2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f44179a = i10;
        this.d = obj;
        this.f44180b = e2Var;
        this.f44181c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f44179a) {
            case 0:
                ((a50) this.d).f37695b.s1(null, this.f44180b, this.f44181c, true);
                return;
            default:
                ((w40) this.d).f44512n.f37695b.s1(null, this.f44180b, this.f44181c, true);
                return;
        }
    }
}
