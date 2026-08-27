package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

public final class y60 implements TextWatcher {

    public final z60 f44713a;

    public y60(z60 z60Var) {
        this.f44713a = z60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String strTrim = editable.toString().trim();
        z60 z60Var = this.f44713a;
        c70 c70Var = z60Var.h;
        if (z60Var.f45056c != 0) {
            c70Var.getConnectionsManager().cancelRequest(z60Var.f45056c, true);
            z60Var.f45056c = 0;
        }
        a30 a30Var = z60Var.d;
        if (a30Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a30Var);
        }
        z60Var.f45057e = null;
        if (strTrim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        a30 a30Var2 = new a30(2, this, strTrim);
        z60Var.d = a30Var2;
        AndroidUtilities.runOnUIThread(a30Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
