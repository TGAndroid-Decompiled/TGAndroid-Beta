package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y60 implements TextWatcher {
    public final z60 f44755a;

    public y60(z60 z60Var) {
        this.f44755a = z60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        z60 z60Var = this.f44755a;
        c70 c70Var = z60Var.h;
        if (z60Var.f45090c != 0) {
            c70Var.getConnectionsManager().cancelRequest(z60Var.f45090c, true);
            z60Var.f45090c = 0;
        }
        org.telegram.ui.Components.voip.o oVar = z60Var.d;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
        }
        z60Var.f45091e = null;
        if (trim.isEmpty()) {
            c70.a0(c70Var, null);
            return;
        }
        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(29, this, trim);
        z60Var.d = oVar2;
        AndroidUtilities.runOnUIThread(oVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
