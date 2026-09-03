package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class a implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final k f42425a;

    public a(k kVar) {
        this.f42425a = kVar;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        k kVar = this.f42425a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f42574w.V2.N(true);
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = h51Var.G(d.class);
        k kVar = this.f42425a;
        if (G) {
            String charSequence = h51Var.f27375l.toString();
            org.telegram.ui.a0 a0Var = kVar.I;
            if (a0Var != null) {
                a0Var.run(charSequence);
            }
        } else if (h51Var.G(g.class) && (tVar = kVar.K) != null) {
            try {
                tVar.run(k.a((MessageObject) h51Var.H));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }
}
