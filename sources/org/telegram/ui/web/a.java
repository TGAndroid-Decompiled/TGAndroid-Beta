package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
public final class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final k f43792a;

    public a(k kVar) {
        this.f43792a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        k kVar = this.f43792a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f43913w.U2.N(true);
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = l41Var.G(d.class);
        k kVar = this.f43792a;
        if (G) {
            String charSequence = l41Var.f30339l.toString();
            org.telegram.ui.a0 a0Var = kVar.H;
            if (a0Var != null) {
                a0Var.run(charSequence);
            }
        } else if (l41Var.G(g.class) && (rVar = kVar.J) != null) {
            try {
                rVar.run(k.a((MessageObject) l41Var.H));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
