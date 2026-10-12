package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class a implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final k f43164a;

    public a(k kVar) {
        this.f43164a = kVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        k kVar = this.f43164a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f43317w.W2.N(true);
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = u61Var.G(d.class);
        k kVar = this.f43164a;
        if (G) {
            String charSequence = u61Var.f31071l.toString();
            org.telegram.ui.z zVar = kVar.L;
            if (zVar != null) {
                zVar.run(charSequence);
            }
        } else if (u61Var.G(g.class) && (sVar = kVar.N) != null) {
            try {
                sVar.run(k.a((MessageObject) u61Var.H));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
