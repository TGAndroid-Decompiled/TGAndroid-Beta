package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.w61;
public final class n extends f5 {
    public final i2.h0 f42275f = new i2.h0(this, 28);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42275f);
        i iVar = oVar.f42288f;
        if (iVar != null) {
            iVar.c();
            oVar.f42288f = null;
        }
        w61 w61Var = oVar.f32724a;
        if (w61Var != null) {
            w61Var.f25244f3.N(true);
            oVar.f32724a.f25243e3.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.v, obj)) {
            oVar.v = obj;
            i iVar = oVar.f42288f;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.f42288f = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f42275f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        w61 w61Var = oVar.f32724a;
        if (w61Var != null) {
            w61Var.f25244f3.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f32724a.f25243e3.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
