package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c71;
public final class o extends k5 {
    public final ki.u f43201r = new ki.u(this, 23);
    public final p f43202s;

    public o(p pVar) {
        this.f43202s = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.f43202s;
        pVar.f43212s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43201r);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        c71 c71Var = pVar.f25615a;
        if (c71Var != null) {
            c71Var.Z2.N(true);
            pVar.f25615a.Y2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.f43202s;
        boolean z10 = !TextUtils.isEmpty(pVar.f43212s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f43212s, obj)) {
            pVar.f43212s = obj;
            j jVar = pVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((o2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.e = jVar2;
            jVar2.a();
            ki.u uVar = this.f43201r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        c71 c71Var = pVar.f25615a;
        if (c71Var != null) {
            c71Var.Z2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f25615a.Y2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
