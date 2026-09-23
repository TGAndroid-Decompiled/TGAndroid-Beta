package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.x51;
public final class n extends f5 {
    public final i2.h0 f38782f = new i2.h0(this, 28);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f38792s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f38782f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        x51 x51Var = oVar.f30163a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            oVar.f30163a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f38792s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f38792s, obj)) {
            oVar.f38792s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((n2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f38782f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        x51 x51Var = oVar.f30163a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f30163a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
