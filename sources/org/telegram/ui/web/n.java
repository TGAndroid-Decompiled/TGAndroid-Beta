package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.u61;
public final class n extends g5 {
    public final ki.u f42681r = new ki.u(this, 23);
    public final o f42682s;

    public n(o oVar) {
        this.f42682s = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.f42682s;
        oVar.f42692s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42681r);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        u61 u61Var = oVar.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            oVar.f31190a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.f42682s;
        boolean z10 = !TextUtils.isEmpty(oVar.f42692s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f42692s, obj)) {
            oVar.f42692s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((n2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            ki.u uVar = this.f42681r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        u61 u61Var = oVar.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f31190a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
