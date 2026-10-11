package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r61;
public final class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final k f43409a;

    public a(k kVar) {
        this.f43409a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        k kVar = this.f43409a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f43562w.W2.N(true);
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        r61 r61Var = (r61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = r61Var.G(d.class);
        k kVar = this.f43409a;
        if (G) {
            String charSequence = r61Var.f30361l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (r61Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) r61Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
