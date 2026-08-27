package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

public final class u21 extends org.telegram.ui.Cells.g3 {

    public final w21 f43079x;

    public u21(w21 w21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, "", true, false, 1024, c6Var);
        this.f43079x = w21Var;
    }

    @Override
    public final void b(Editable editable) {
        w21 w21Var = this.f43079x;
        lh.d dVar = w21Var.f43588s;
        if (dVar != null) {
            dVar.setEnabled(w21Var.d.optional || !TextUtils.isEmpty(w21Var.f43586n.getText()));
        }
    }
}
