package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e51;

public final class o extends e5 {

    public final nh.f0 f43923f = new nh.f0(this, 21);
    public final p h;

    public o(p pVar) {
        this.h = pVar;
    }

    @Override
    public final void m() {
        p pVar = this.h;
        pVar.f43933s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f43923f);
        j jVar = pVar.f43929e;
        if (jVar != null) {
            jVar.c();
            pVar.f43929e = null;
        }
        e51 e51Var = pVar.f28261a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            pVar.f28261a.T2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        p pVar = this.h;
        boolean z10 = !TextUtils.isEmpty(pVar.f43933s);
        String string = editText.getText().toString();
        if (!TextUtils.equals(pVar.f43933s, string)) {
            pVar.f43933s = string;
            j jVar = pVar.f43929e;
            if (jVar != null) {
                jVar.c();
            }
            j jVar2 = new j(string, ((n2) pVar).currentAccount, new m(pVar, 1));
            pVar.f43929e = jVar2;
            jVar2.a();
            nh.f0 f0Var = this.f43923f;
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            AndroidUtilities.runOnUIThread(f0Var, 500L);
        }
        e51 e51Var = pVar.f28261a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(string))) {
                pVar.f28261a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
