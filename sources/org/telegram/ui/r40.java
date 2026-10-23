package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r40 implements DialogInterface.OnShowListener {
    public final int f41012a;
    public final org.telegram.ui.ActionBar.c2 f41013b;
    public final EditTextBoldCursor f41014c;
    public final Object d;

    public r40(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f41012a = i10;
        this.d = obj;
        this.f41013b = c2Var;
        this.f41014c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f41012a) {
            case 0:
                ((w40) this.d).f42922b.s1(null, this.f41013b, this.f41014c, true);
                return;
            default:
                ((s40) this.d).f41303n.f42922b.s1(null, this.f41013b, this.f41014c, true);
                return;
        }
    }
}
