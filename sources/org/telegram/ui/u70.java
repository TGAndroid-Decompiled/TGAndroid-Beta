package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class u70 implements TextWatcher {
    public final v70 f40556a;

    public u70(v70 v70Var) {
        this.f40556a = v70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        v70 v70Var = this.f40556a;
        y70 y70Var = v70Var.h;
        if (v70Var.f40915c != 0) {
            y70Var.getConnectionsManager().cancelRequest(v70Var.f40915c, true);
            v70Var.f40915c = 0;
        }
        o00 o00Var = v70Var.d;
        if (o00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o00Var);
        }
        v70Var.e = null;
        if (trim.isEmpty()) {
            y70.a0(y70Var, null);
            return;
        }
        o00 o00Var2 = new o00(12, this, trim);
        v70Var.d = o00Var2;
        AndroidUtilities.runOnUIThread(o00Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
