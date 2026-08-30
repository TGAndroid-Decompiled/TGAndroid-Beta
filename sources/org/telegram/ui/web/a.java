package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
public final class a implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final k f39416a;

    public a(k kVar) {
        this.f39416a = kVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        k kVar = this.f39416a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f39553w.V2.N(true);
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.t tVar;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = i51Var.G(d.class);
        k kVar = this.f39416a;
        if (G) {
            String charSequence = i51Var.f25565l.toString();
            org.telegram.ui.a0 a0Var = kVar.I;
            if (a0Var != null) {
                a0Var.run(charSequence);
            }
        } else if (i51Var.G(g.class) && (tVar = kVar.K) != null) {
            try {
                tVar.run(k.a((MessageObject) i51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
