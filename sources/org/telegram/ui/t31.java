package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class t31 extends org.telegram.ui.Cells.j3 {
    public final u31 f40682x;

    public t31(u31 u31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f40682x = u31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        u31 u31Var = this.f40682x;
        ci.d dVar = u31Var.f41044s;
        if (dVar != null) {
            if (!u31Var.d.optional && TextUtils.isEmpty(u31Var.f41042n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
