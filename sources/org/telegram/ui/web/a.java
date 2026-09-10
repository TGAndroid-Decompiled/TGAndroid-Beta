package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
public final class a implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final l f37850a;

    public a(l lVar) {
        this.f37850a = lVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        l lVar = this.f37850a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f38004w.Y2.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = v51Var.G(e.class);
        l lVar = this.f37850a;
        if (G) {
            String charSequence = v51Var.f27829l.toString();
            org.telegram.ui.z zVar = lVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (v51Var.G(h.class) && (sVar = lVar.N) != null) {
            try {
                sVar.run(l.a((MessageObject) v51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
