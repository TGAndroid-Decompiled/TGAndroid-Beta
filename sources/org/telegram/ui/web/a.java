package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f38615a;

    public a(k kVar) {
        this.f38615a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f38615a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f38755w.Y2.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = h51Var.G(d.class);
        k kVar = this.f38615a;
        if (G) {
            String charSequence = h51Var.f24507l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (h51Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) h51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
