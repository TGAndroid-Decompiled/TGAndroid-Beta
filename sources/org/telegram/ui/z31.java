package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class z31 extends org.telegram.ui.Cells.i3 {
    public final a41 f40058x;

    public z31(a41 a41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.f40058x = a41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        a41 a41Var = this.f40058x;
        ci.d dVar = a41Var.f31695s;
        if (dVar != null) {
            if (!a41Var.d.optional && TextUtils.isEmpty(a41Var.f31693n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
