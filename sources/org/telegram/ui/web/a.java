package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f42088a;

    public a(k kVar) {
        this.f42088a = kVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f42088a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f42252w.f25245f3.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = g61Var.G(d.class);
        k kVar = this.f42088a;
        if (G) {
            String charSequence = g61Var.f26669l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (g61Var.G(g.class) && (sVar = kVar.N) != null) {
            try {
                sVar.run(k.a((MessageObject) g61Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
