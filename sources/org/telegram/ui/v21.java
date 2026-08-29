package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class v21 extends org.telegram.ui.Cells.g3 {
    public final x21 f43409x;

    public v21(x21 x21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.f43409x = x21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        x21 x21Var = this.f43409x;
        nh.d dVar = x21Var.f44449s;
        if (dVar != null) {
            if (!x21Var.d.optional && TextUtils.isEmpty(x21Var.f44447n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
