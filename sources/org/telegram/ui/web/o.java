package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.l61;
public final class o extends i5 {
    public final org.telegram.ui.Components.voip.x f38027f = new org.telegram.ui.Components.voip.x(this, 10);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.f38043s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f38027f);
        j jVar = pVar.e;
        if (jVar != null) {
            jVar.c();
            pVar.e = null;
        }
        l61 l61Var = pVar.f25171a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            pVar.f25171a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.f38043s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f38043s, obj)) {
            pVar.f38043s = obj;
            j jVar = pVar.e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.p2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.e = jVar2;
            jVar2.a();
            org.telegram.ui.Components.voip.x xVar = this.f38027f;
            AndroidUtilities.cancelRunOnUIThread(xVar);
            AndroidUtilities.runOnUIThread(xVar, 500L);
        }
        l61 l61Var = pVar.f25171a;
        if (l61Var != null) {
            l61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f25171a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
