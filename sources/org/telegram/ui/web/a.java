package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f42509a;

    public a(k kVar) {
        this.f42509a = kVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f42509a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f42653w.W2.N(true);
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = f61Var.G(d.class);
        k kVar = this.f42509a;
        if (G) {
            String charSequence = f61Var.f26140l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (f61Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) f61Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
