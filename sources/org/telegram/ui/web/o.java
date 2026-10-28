package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.m71;
public final class o extends org.telegram.ui.ActionBar.s0 {
    public final k2.c f44846a = new k2.c(this, 26);
    public final p f44847b;

    public o(p pVar) {
        this.f44847b = pVar;
    }

    @Override
    public final void h() {
        p pVar = this.f44847b;
        pVar.v = null;
        AndroidUtilities.cancelRunOnUIThread(this.f44846a);
        j jVar = pVar.f44854f;
        if (jVar != null) {
            jVar.c();
            pVar.f44854f = null;
        }
        m71 m71Var = pVar.f30764a;
        if (m71Var != null) {
            m71Var.f32504g3.O(true);
            pVar.f30764a.f32503f3.h1(0, 0);
        }
    }

    @Override
    public final void l(EditText editText) {
        int i10;
        p pVar = this.f44847b;
        boolean z10 = !TextUtils.isEmpty(pVar.v);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(pVar.v, obj)) {
            pVar.v = obj;
            j jVar = pVar.f44854f;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((r2) pVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(pVar, 1));
            pVar.f44854f = jVar2;
            jVar2.a();
            k2.c cVar = this.f44846a;
            AndroidUtilities.cancelRunOnUIThread(cVar);
            AndroidUtilities.runOnUIThread(cVar, 500L);
        }
        m71 m71Var = pVar.f30764a;
        if (m71Var != null) {
            m71Var.f32504g3.O(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                pVar.f30764a.f32503f3.h1(0, 0);
            }
        }
    }

    @Override
    public final void i() {
    }
}
