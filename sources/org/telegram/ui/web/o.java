package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.n61;
public final class o extends g5 {
    public final i2.g0 f38997f = new i2.g0(this, 28);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f38997f);
        i iVar = pVar.f39007f;
        if (iVar != null) {
            iVar.c();
            pVar.f39007f = null;
        }
        n61 n61Var = pVar.f26891a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            pVar.f26891a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.v, obj)) {
            pVar.v = obj;
            i iVar = pVar.f39007f;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.f39007f = iVar2;
            iVar2.a();
            i2.g0 g0Var = this.f38997f;
            AndroidUtilities.cancelRunOnUIThread(g0Var);
            AndroidUtilities.runOnUIThread(g0Var, 500L);
        }
        n61 n61Var = pVar.f26891a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f26891a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
