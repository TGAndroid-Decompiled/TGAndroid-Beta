package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;
public final class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final k f38704a;

    public a(k kVar) {
        this.f38704a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        k kVar = this.f38704a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f38850w.Y2.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = j51Var.G(d.class);
        k kVar = this.f38704a;
        if (G) {
            String charSequence = j51Var.f25124l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (j51Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) j51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
