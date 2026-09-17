package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.x51;
public final class p extends g5 {
    public final b f42232f = new b(this, 1);
    public final q h;

    public p(q qVar) {
        this.h = qVar;
    }

    @Override
    public final void m() {
        q qVar = this.h;
        qVar.f42243s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f42232f);
        j jVar = qVar.f42239e;
        if (jVar != null) {
            jVar.c();
            qVar.f42239e = null;
        }
        x51 x51Var = qVar.f32877a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            qVar.f32877a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        q qVar = this.h;
        boolean z10 = !TextUtils.isEmpty(qVar.f42243s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(qVar.f42243s, obj)) {
            qVar.f42243s = obj;
            j jVar = qVar.f42239e;
            if (jVar != null) {
                jVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
            j jVar2 = new j(obj, i10, new m(qVar, 1));
            qVar.f42239e = jVar2;
            jVar2.a();
            b bVar = this.f42232f;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 500L);
        }
        x51 x51Var = qVar.f32877a;
        if (x51Var != null) {
            x51Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                qVar.f32877a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
