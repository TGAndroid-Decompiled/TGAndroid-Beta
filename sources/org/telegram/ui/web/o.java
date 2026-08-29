package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.o51;
public final class o extends e5 {
    public final m6 f44126f = new m6(this, 24);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.f44136s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f44126f);
        j jVar = pVar.f44132e;
        if (jVar != null) {
            jVar.c();
            pVar.f44132e = null;
        }
        o51 o51Var = pVar.f31601a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            pVar.f31601a.T2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.f44136s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f44136s, obj)) {
            pVar.f44136s = obj;
            j jVar = pVar.f44132e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((o2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.f44132e = jVar2;
            jVar2.a();
            m6 m6Var = this.f44126f;
            AndroidUtilities.cancelRunOnUIThread(m6Var);
            AndroidUtilities.runOnUIThread(m6Var, 500L);
        }
        o51 o51Var = pVar.f31601a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f31601a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
