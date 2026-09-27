package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class t31 extends org.telegram.ui.Cells.j3 {
    public final u31 f37642x;

    public t31(u31 u31Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, "", true, false, 1024, e6Var);
        this.f37642x = u31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        u31 u31Var = this.f37642x;
        ci.d dVar = u31Var.f38118s;
        if (dVar != null) {
            if (!u31Var.d.optional && TextUtils.isEmpty(u31Var.f38116n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
