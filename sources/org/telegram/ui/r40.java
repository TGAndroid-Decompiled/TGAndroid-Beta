package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r40 implements DialogInterface.OnShowListener {
    public final int f41024a;
    public final org.telegram.ui.ActionBar.c2 f41025b;
    public final EditTextBoldCursor f41026c;
    public final Object d;

    public r40(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f41024a = i10;
        this.d = obj;
        this.f41025b = c2Var;
        this.f41026c = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f41024a) {
            case 0:
                ((w40) this.d).f42898b.s1(null, this.f41025b, this.f41026c, true);
                return;
            default:
                ((s40) this.d).f41296n.f42898b.s1(null, this.f41025b, this.f41026c, true);
                return;
        }
    }
}
