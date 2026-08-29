package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;
public final class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final l f43969a;

    public a(l lVar) {
        this.f43969a = lVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        l lVar = this.f43969a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f44103w.U2.N(true);
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = w41Var.G(e.class);
        l lVar = this.f43969a;
        if (G) {
            String charSequence = w41Var.f34300l.toString();
            org.telegram.ui.b0 b0Var = lVar.H;
            if (b0Var != null) {
                b0Var.run(charSequence);
            }
        } else if (w41Var.G(h.class) && (tVar = lVar.J) != null) {
            try {
                tVar.run(l.a((MessageObject) w41Var.H));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
