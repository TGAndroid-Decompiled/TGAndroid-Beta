package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.u61;
public final class o extends g5 {
    public final ki.u f42715r = new ki.u(this, 23);
    public final p f42716s;

    public o(p pVar) {
        this.f42716s = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.f42716s;
        pVar.f42725s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42715r);
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.c();
            pVar.e = null;
        }
        u61 u61Var = pVar.f31197a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            pVar.f31197a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.f42716s;
        boolean z10 = !TextUtils.isEmpty(pVar.f42725s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f42725s, obj)) {
            pVar.f42725s = obj;
            i iVar = pVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((n2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.e = iVar2;
            iVar2.a();
            ki.u uVar = this.f42715r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        u61 u61Var = pVar.f31197a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f31197a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
