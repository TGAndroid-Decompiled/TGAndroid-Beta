package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.v61;
public final class o extends g5 {
    public final ki.u f42731r = new ki.u(this, 23);
    public final p f42732s;

    public o(p pVar) {
        this.f42732s = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.f42732s;
        pVar.f42741s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42731r);
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.c();
            pVar.e = null;
        }
        v61 v61Var = pVar.f32027a;
        if (v61Var != null) {
            v61Var.W2.N(true);
            pVar.f32027a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.f42732s;
        boolean z10 = !TextUtils.isEmpty(pVar.f42741s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f42741s, obj)) {
            pVar.f42741s = obj;
            i iVar = pVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((n2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.e = iVar2;
            iVar2.a();
            ki.u uVar = this.f42731r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        v61 v61Var = pVar.f32027a;
        if (v61Var != null) {
            v61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f32027a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
