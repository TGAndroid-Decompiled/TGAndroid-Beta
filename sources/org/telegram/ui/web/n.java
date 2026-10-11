package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.g71;
public final class n extends e5 {
    public final i2.h0 f43592f = new i2.h0(this, 28);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f43607s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43592f);
        i iVar = oVar.f43603e;
        if (iVar != null) {
            iVar.c();
            oVar.f43603e = null;
        }
        g71 g71Var = oVar.f26922a;
        if (g71Var != null) {
            g71Var.W2.N(true);
            oVar.f26922a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f43607s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f43607s, obj)) {
            oVar.f43607s = obj;
            i iVar = oVar.f43603e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.m2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.f43603e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f43592f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        g71 g71Var = oVar.f26922a;
        if (g71Var != null) {
            g71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f26922a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
