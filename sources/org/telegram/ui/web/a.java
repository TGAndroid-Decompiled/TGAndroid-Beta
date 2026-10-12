package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
public final class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final k f41268a;

    public a(k kVar) {
        this.f41268a = kVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        k kVar = this.f41268a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f41408w.W2.N(true);
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = l61Var.G(d.class);
        k kVar = this.f41268a;
        if (G) {
            String charSequence = l61Var.f26954l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (l61Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) l61Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
