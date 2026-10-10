package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q61;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f43263a;

    public a(k kVar) {
        this.f43263a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f43263a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f43418w.W2.N(true);
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        q61 q61Var = (q61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = q61Var.G(d.class);
        k kVar = this.f43263a;
        if (G) {
            String charSequence = q61Var.f30063l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (q61Var.G(g.class) && (sVar = kVar.N) != null) {
            try {
                sVar.run(k.a((MessageObject) q61Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
