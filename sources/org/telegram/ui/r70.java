package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class r70 implements TextWatcher {
    public final s70 f41523a;

    public r70(s70 s70Var) {
        this.f41523a = s70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        s70 s70Var = this.f41523a;
        v70 v70Var = s70Var.h;
        if (s70Var.f41828c != 0) {
            v70Var.getConnectionsManager().cancelRequest(s70Var.f41828c, true);
            s70Var.f41828c = 0;
        }
        org.telegram.ui.Components.voip.p pVar = s70Var.d;
        if (pVar != null) {
            AndroidUtilities.cancelRunOnUIThread(pVar);
        }
        s70Var.f41829e = null;
        if (trim.isEmpty()) {
            v70.a0(v70Var, null);
            return;
        }
        org.telegram.ui.Components.voip.p pVar2 = new org.telegram.ui.Components.voip.p(29, this, trim);
        s70Var.d = pVar2;
        AndroidUtilities.runOnUIThread(pVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
