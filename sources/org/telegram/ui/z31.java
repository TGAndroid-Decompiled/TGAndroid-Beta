package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class z31 extends org.telegram.ui.Cells.j3 {
    public final a41 f44608x;

    public z31(a41 a41Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f44608x = a41Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        a41 a41Var = this.f44608x;
        ci.d dVar = a41Var.f35917s;
        if (dVar != null) {
            if (!a41Var.d.optional && TextUtils.isEmpty(a41Var.f35915n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
