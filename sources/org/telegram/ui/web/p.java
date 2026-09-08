package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.x51;
public final class p extends g5 {
    public final b f42231f = new b(this, 1);
    public final q h;

    public p(q qVar) {
        this.h = qVar;
    }

    @Override
    public final void m() {
        q qVar = this.h;
        qVar.f42242s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42231f);
        j jVar = qVar.f42238e;
        if (jVar != null) {
            jVar.c();
            qVar.f42238e = null;
        }
        x51 x51Var = qVar.f32876a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            qVar.f32876a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        q qVar = this.h;
        boolean z10 = !TextUtils.isEmpty(qVar.f42242s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(qVar.f42242s, obj)) {
            qVar.f42242s = obj;
            j jVar = qVar.f42238e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(qVar, 1));
            qVar.f42238e = jVar2;
            jVar2.a();
            b bVar = this.f42231f;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
        x51 x51Var = qVar.f32876a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                qVar.f32876a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
