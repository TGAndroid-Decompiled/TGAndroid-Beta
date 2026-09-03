package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a61;
public final class o extends h5 {
    public final n5 f39539f = new n5(this, 29);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.f39549s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f39539f);
        i iVar = pVar.e;
        if (iVar != null) {
            iVar.c();
            pVar.e = null;
        }
        a61 a61Var = pVar.f23568a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            pVar.f23568a.U2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z4 = !TextUtils.isEmpty(pVar.f39549s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f39549s, obj)) {
            pVar.f39549s = obj;
            i iVar = pVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((p2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.e = iVar2;
            iVar2.a();
            n5 n5Var = this.f39539f;
            AndroidUtilities.cancelRunOnUIThread(n5Var);
            AndroidUtilities.runOnUIThread(n5Var, 500L);
        }
        a61 a61Var = pVar.f23568a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                pVar.f23568a.U2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
