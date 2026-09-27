package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.n61;
public final class n extends g5 {
    public final i2.h0 f39101f = new i2.h0(this, 28);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f39101f);
        i iVar = oVar.f39111f;
        if (iVar != null) {
            iVar.c();
            oVar.f39111f = null;
        }
        n61 n61Var = oVar.f27008a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            oVar.f27008a.X2.h1(0, 0);
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
            i iVar = oVar.f39111f;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.o2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.f39111f = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f39101f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        n61 n61Var = oVar.f27008a;
        if (n61Var != null) {
            n61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f27008a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
