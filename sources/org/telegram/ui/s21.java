package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class s21 extends org.telegram.ui.Cells.g3 {
    public final u21 E;

    public s21(u21 u21Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, "", true, false, 1024, u6Var);
        this.E = u21Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        u21 u21Var = this.E;
        fi.d dVar = u21Var.f43990s;
        if (dVar != null) {
            if (!u21Var.d.optional && TextUtils.isEmpty(u21Var.f43988n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
