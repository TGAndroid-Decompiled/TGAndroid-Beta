package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d71;
public final class o extends k5 {
    public final ki.u f43212r = new ki.u(this, 23);
    public final p f43213s;

    public o(p pVar) {
        this.f43213s = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.f43213s;
        pVar.f43223s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43212r);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        d71 d71Var = pVar.f25907a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            pVar.f25907a.Y2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.f43213s;
        boolean z10 = !TextUtils.isEmpty(pVar.f43223s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f43223s, obj)) {
            pVar.f43223s = obj;
            j jVar = pVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((o2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.e = jVar2;
            jVar2.a();
            ki.u uVar = this.f43212r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        d71 d71Var = pVar.f25907a;
        if (d71Var != null) {
            d71Var.Z2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f25907a.Y2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
