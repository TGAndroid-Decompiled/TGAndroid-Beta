package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.m61;
public final class n extends e5 {
    public final i2.h0 f39149f = new i2.h0(this, 29);
    public final o h;

    public n(o oVar) {
        this.h = oVar;
    }

    @Override
    public final void m() {
        o oVar = this.h;
        oVar.f39162s = null;
        AndroidUtilities.cancelRunOnUIThread(this.f39149f);
        i iVar = oVar.e;
        if (iVar != null) {
            iVar.c();
            oVar.e = null;
        }
        m61 m61Var = oVar.f26682a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            oVar.f26682a.X2.h1(0, 0);
        }
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        o oVar = this.h;
        boolean z10 = !TextUtils.isEmpty(oVar.f39162s);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(oVar.f39162s, obj)) {
            oVar.f39162s = obj;
            i iVar = oVar.e;
            if (iVar != null) {
                iVar.c();
            }
            i10 = ((org.telegram.ui.ActionBar.m2) oVar).currentAccount;
            i iVar2 = new i(obj, i10, new l(oVar, 1));
            oVar.e = iVar2;
            iVar2.a();
            i2.h0 h0Var = this.f39149f;
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            AndroidUtilities.runOnUIThread(h0Var, 500L);
        }
        m61 m61Var = oVar.f26682a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                oVar.f26682a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
