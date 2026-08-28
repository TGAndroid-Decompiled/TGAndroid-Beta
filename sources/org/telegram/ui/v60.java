package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class v60 implements TextWatcher {
    public final w60 f43395a;

    public v60(w60 w60Var) {
        this.f43395a = w60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        w60 w60Var = this.f43395a;
        z60 z60Var = w60Var.h;
        if (w60Var.f43682c != 0) {
            z60Var.getConnectionsManager().cancelRequest(w60Var.f43682c, true);
            w60Var.f43682c = 0;
        }
        x20 x20Var = w60Var.d;
        if (x20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x20Var);
        }
        w60Var.f43683e = null;
        if (trim.isEmpty()) {
            z60.Z(z60Var, null);
            return;
        }
        x20 x20Var2 = new x20(2, this, trim);
        w60Var.d = x20Var2;
        AndroidUtilities.runOnUIThread(x20Var2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
