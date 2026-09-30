package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
public final class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final k f39071a;

    public a(k kVar) {
        this.f39071a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        k kVar = this.f39071a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f39212w.f28778f3.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        y51 y51Var = (y51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = y51Var.G(d.class);
        k kVar = this.f39071a;
        if (G) {
            String charSequence = y51Var.f30637l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (y51Var.G(g.class) && (sVar = kVar.N) != null) {
            try {
                sVar.run(k.a((MessageObject) y51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
