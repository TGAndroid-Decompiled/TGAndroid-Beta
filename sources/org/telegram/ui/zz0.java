package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class zz0 extends org.telegram.ui.Cells.m3 {
    public final b01 E;

    public zz0(b01 b01Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, "", true, false, 1024, p6Var);
        this.E = b01Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        b01 b01Var = this.E;
        vh.d dVar = b01Var.f35925s;
        if (dVar != null) {
            if (!b01Var.d.optional && TextUtils.isEmpty(b01Var.f35923n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
