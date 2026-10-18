package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.u61;
public final class p extends g5 {
    public final ki.u f42699r = new ki.u(this, 23);
    public final q f42700s;

    public p(q qVar) {
        this.f42700s = qVar;
    }

    @Override
    public final void m() {
        q qVar = this.f42700s;
        qVar.f42709s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42699r);
        j jVar = qVar.e;
        if (jVar != null) {
            jVar.c();
            qVar.e = null;
        }
        u61 u61Var = qVar.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            qVar.f31190a.V2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        q qVar = this.f42700s;
        boolean z10 = !TextUtils.isEmpty(qVar.f42709s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(qVar.f42709s, obj)) {
            qVar.f42709s = obj;
            j jVar = qVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(qVar, 1));
            qVar.e = jVar2;
            jVar2.a();
            ki.u uVar = this.f42699r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
        }
        u61 u61Var = qVar.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                qVar.f31190a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
