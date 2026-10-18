package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y60 implements TextWatcher {
    public final z60 f43317a;

    public y60(z60 z60Var) {
        this.f43317a = z60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        z60 z60Var = this.f43317a;
        c70 c70Var = z60Var.h;
        if (z60Var.f43632c != 0) {
            c70Var.getConnectionsManager().cancelRequest(z60Var.f43632c, true);
            z60Var.f43632c = 0;
        }
        nt ntVar = z60Var.d;
        if (ntVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ntVar);
        }
        z60Var.e = null;
        if (trim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        nt ntVar2 = new nt(25, this, trim);
        z60Var.d = ntVar2;
        AndroidUtilities.runOnUIThread(ntVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
