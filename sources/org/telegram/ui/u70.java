package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class u70 implements TextWatcher {
    public final v70 f40282a;

    public u70(v70 v70Var) {
        this.f40282a = v70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        v70 v70Var = this.f40282a;
        y70 y70Var = v70Var.h;
        if (v70Var.f40602c != 0) {
            y70Var.getConnectionsManager().cancelRequest(v70Var.f40602c, true);
            v70Var.f40602c = 0;
        }
        d20 d20Var = v70Var.d;
        if (d20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d20Var);
        }
        v70Var.e = null;
        if (trim.isEmpty()) {
            y70.a0(y70Var, null);
            return;
        }
        d20 d20Var2 = new d20(7, this, trim);
        v70Var.d = d20Var2;
        AndroidUtilities.runOnUIThread(d20Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
