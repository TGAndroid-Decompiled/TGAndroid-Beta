package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
public final class r31 extends org.telegram.ui.Cells.j3 {
    public final s31 f37178x;

    public r31(s31 s31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, "", true, false, 1024, d6Var);
        this.f37178x = s31Var;
    }

    @Override
    public final void b(Editable editable) {
        boolean z10;
        s31 s31Var = this.f37178x;
        ci.d dVar = s31Var.f37586s;
        if (dVar != null) {
            if (!s31Var.d.optional && TextUtils.isEmpty(s31Var.f37584n.getText())) {
                z10 = false;
            } else {
                z10 = true;
            }
            dVar.setEnabled(z10);
        }
    }
}
