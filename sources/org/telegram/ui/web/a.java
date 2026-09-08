package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final l f42021a;

    public a(l lVar) {
        this.f42021a = lVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l lVar = this.f42021a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f42193w.Y2.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = h51Var.G(e.class);
        l lVar = this.f42021a;
        if (G) {
            String charSequence = h51Var.f26621l.toString();
            org.telegram.ui.y yVar = lVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (h51Var.G(h.class) && (rVar = lVar.N) != null) {
            try {
                rVar.run(l.a((MessageObject) h51Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
