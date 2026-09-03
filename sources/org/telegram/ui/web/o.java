package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.a61;
public final class o extends i5 {
    public final t3 f42615f = new t3(this, 28);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.f42625s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42615f);
        i iVar = pVar.f42621e;
        if (iVar != null) {
            iVar.c();
            pVar.f42621e = null;
        }
        a61 a61Var = pVar.f25523a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            pVar.f25523a.U2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        p pVar = this.h;
        boolean z4 = !TextUtils.isEmpty(pVar.f42625s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.f42625s, obj)) {
            pVar.f42625s = obj;
            i iVar = pVar.f42621e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((p2) pVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(pVar, 1));
            pVar.f42621e = iVar2;
            iVar2.a();
            t3 t3Var = this.f42615f;
            AndroidUtilities.cancelRunOnUIThread(t3Var);
            AndroidUtilities.runOnUIThread(t3Var, 500L);
        }
        a61 a61Var = pVar.f25523a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                pVar.f25523a.U2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
