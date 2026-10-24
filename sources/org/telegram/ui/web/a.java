package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
public final class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final l f43018a;

    public a(l lVar) {
        this.f43018a = lVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        l lVar = this.f43018a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f43173w.Z2.N(true);
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.q qVar;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = l61Var.G(e.class);
        l lVar = this.f43018a;
        if (G) {
            String charSequence = l61Var.f28227l.toString();
            org.telegram.ui.y yVar = lVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (l61Var.G(h.class) && (qVar = lVar.N) != null) {
            try {
                qVar.run(l.a((MessageObject) l61Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
