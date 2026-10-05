package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f42107a;

    public a(k kVar) {
        this.f42107a = kVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f42107a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f42271w.f26034f3.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean H = h61Var.H(d.class);
        k kVar = this.f42107a;
        if (H) {
            String charSequence = h61Var.f27093l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (h61Var.H(g.class) && (sVar = kVar.N) != null) {
            try {
                sVar.run(k.a((MessageObject) h61Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
