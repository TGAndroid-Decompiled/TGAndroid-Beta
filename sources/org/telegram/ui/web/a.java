package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final l f42506a;

    public a(l lVar) {
        this.f42506a = lVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l lVar = this.f42506a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f42659w.W2.N(true);
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = f61Var.G(e.class);
        l lVar = this.f42506a;
        if (G) {
            String charSequence = f61Var.f26140l.toString();
            org.telegram.ui.z zVar = lVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (f61Var.G(h.class) && (rVar = lVar.N) != null) {
            try {
                rVar.run(l.a((MessageObject) f61Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
