package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c51;
public final class n extends e5 {
    public final m2 f43936f = new m2(this, 15);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f43946s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43936f);
        i iVar = oVar.f43942e;
        if (iVar != null) {
            iVar.c();
            oVar.f43942e = null;
        }
        c51 c51Var = oVar.f27658a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            oVar.f27658a.T2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i9;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f43946s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f43946s, obj)) {
            oVar.f43946s = obj;
            i iVar = oVar.f43942e;
            if (iVar != null) {
                iVar.c();
            }
            i9 = ((o2) oVar).currentAccount;
            i iVar2 = new i(obj, i9, new l(oVar, 1));
            oVar.f43942e = iVar2;
            iVar2.a();
            m2 m2Var = this.f43936f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
        }
        c51 c51Var = oVar.f27658a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f27658a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
