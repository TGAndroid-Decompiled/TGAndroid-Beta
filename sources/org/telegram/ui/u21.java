package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class u21 extends org.telegram.ui.Cells.g3 {
    public final w21 E;

    public u21(w21 w21Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, "", true, false, 1024, u6Var);
        this.E = w21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        w21 w21Var = this.E;
        fi.d dVar = w21Var.f44505s;
        if (dVar != null) {
            if (!w21Var.d.optional && TextUtils.isEmpty(w21Var.f44503n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
