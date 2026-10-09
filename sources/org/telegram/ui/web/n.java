package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.e71;
public final class n extends g5 {
    public final i2.h0 f43404f = new i2.h0(this, 29);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f43419s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43404f);
        i iVar = oVar.f43415e;
        if (iVar != null) {
            iVar.c();
            oVar.f43415e = null;
        }
        e71 e71Var = oVar.f26290a;
        if (e71Var != null) {
            e71Var.W2.N(true);
            oVar.f26290a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f43419s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f43419s, obj)) {
            oVar.f43419s = obj;
            i iVar = oVar.f43415e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.f43415e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f43404f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        e71 e71Var = oVar.f26290a;
        if (e71Var != null) {
            e71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f26290a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
