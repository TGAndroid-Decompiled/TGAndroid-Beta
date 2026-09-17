package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class r70 implements TextWatcher {
    public final s70 f37104a;

    public r70(s70 s70Var) {
        this.f37104a = s70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        s70 s70Var = this.f37104a;
        v70 v70Var = s70Var.h;
        if (s70Var.f37399c != 0) {
            v70Var.getConnectionsManager().cancelRequest(s70Var.f37399c, true);
            s70Var.f37399c = 0;
        }
        mw mwVar = s70Var.d;
        if (mwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mwVar);
        }
        s70Var.e = null;
        if (trim.isEmpty()) {
            v70.a0(v70Var, null);
            return;
        }
        mw mwVar2 = new mw(20, this, trim);
        s70Var.d = mwVar2;
        AndroidUtilities.runOnUIThread(mwVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
