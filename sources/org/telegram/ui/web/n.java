package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.b71;
public final class n extends e5 {
    public final org.telegram.ui.Components.voip.m2 f41436f = new org.telegram.ui.Components.voip.m2(this, 4);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f41446s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f41436f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        b71 b71Var = oVar.f23964a;
        if (b71Var != null) {
            b71Var.W2.N(true);
            oVar.f23964a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f41446s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f41446s, obj)) {
            oVar.f41446s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.m2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            org.telegram.ui.Components.voip.m2 m2Var = this.f41436f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
        }
        b71 b71Var = oVar.f23964a;
        if (b71Var != null) {
            b71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f23964a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
