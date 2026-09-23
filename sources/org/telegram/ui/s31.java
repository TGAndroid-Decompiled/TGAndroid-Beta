package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class s31 extends org.telegram.ui.Cells.i3 {
    public final t31 f37112x;

    public s31(t31 t31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f37112x = t31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        t31 t31Var = this.f37112x;
        ci.d dVar = t31Var.f37518s;
        if (dVar != null) {
            if (!t31Var.d.optional && TextUtils.isEmpty(t31Var.f37516n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
