package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class yz0 extends org.telegram.ui.Cells.m3 {
    public final a01 E;

    public yz0(a01 a01Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, "", true, false, 1024, p6Var);
        this.E = a01Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        a01 a01Var = this.E;
        vh.d dVar = a01Var.f35510s;
        if (dVar != null) {
            if (!a01Var.d.optional && TextUtils.isEmpty(a01Var.f35508n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
