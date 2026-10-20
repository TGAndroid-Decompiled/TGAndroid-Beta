package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class w60 implements TextWatcher {
    public final x60 f42479a;

    public w60(x60 x60Var) {
        this.f42479a = x60Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String trim = editable.toString().trim();
        x60 x60Var = this.f42479a;
        a70 a70Var = x60Var.h;
        if (x60Var.f43110c != 0) {
            a70Var.getConnectionsManager().cancelRequest(x60Var.f43110c, true);
            x60Var.f43110c = 0;
        }
        lt ltVar = x60Var.d;
        if (ltVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ltVar);
        }
        x60Var.e = null;
        if (trim.isEmpty()) {
            a70.a0(a70Var, null);
            return;
        }
        lt ltVar2 = new lt(25, this, trim);
        x60Var.d = ltVar2;
        AndroidUtilities.runOnUIThread(ltVar2, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
