package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.o61;
public final class n extends e5 {
    public final i2.h0 f39239f = new i2.h0(this, 29);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f39252s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f39239f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        o61 o61Var = oVar.f27258a;
        if (o61Var != null) {
            o61Var.f28778f3.N(true);
            oVar.f27258a.f28777e3.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f39252s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f39252s, obj)) {
            oVar.f39252s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.m2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f39239f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        o61 o61Var = oVar.f27258a;
        if (o61Var != null) {
            o61Var.f28778f3.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f27258a.f28777e3.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
