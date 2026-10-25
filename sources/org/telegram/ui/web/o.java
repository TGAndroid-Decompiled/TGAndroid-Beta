package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.l71;
public final class o extends org.telegram.ui.ActionBar.s0 {
    public final k2.c f45332a = new k2.c(this, 26);
    public final p f45333b;

    public o(p pVar) {
        this.f45333b = pVar;
    }

    @Override
    public final void h() {
        p pVar = this.f45333b;
        pVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f45332a);
        j jVar = pVar.f45340f;
        if (jVar != null) {
            jVar.c();
            pVar.f45340f = null;
        }
        l71 l71Var = pVar.f30417a;
        if (l71Var != null) {
            l71Var.f32150g3.O(true);
            pVar.f30417a.f32149f3.h1(0, 0);
        }
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        p pVar = this.f45333b;
        boolean z10 = !TextUtils.isEmpty(pVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.v, obj)) {
            pVar.v = obj;
            j jVar = pVar.f45340f;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((r2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.f45340f = jVar2;
            jVar2.a();
            k2.c cVar = this.f45332a;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 500L);
        }
        l71 l71Var = pVar.f30417a;
        if (l71Var != null) {
            l71Var.f32150g3.O(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f30417a.f32149f3.h1(0, 0);
            }
        }
    }

    @Override
    public final void i() {
    }
}
