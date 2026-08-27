package org.telegram.ui.web;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;

public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {

    public final l f43770a;

    public a(l lVar) {
        this.f43770a = lVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        l lVar = this.f43770a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f43900w.U2.N(true);
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.s sVar;
        n41 n41Var = (n41) obj;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean zG = n41Var.G(e.class);
        l lVar = this.f43770a;
        if (zG) {
            String string = n41Var.f30844l.toString();
            org.telegram.ui.b0 b0Var = lVar.H;
            if (b0Var != null) {
                b0Var.run(string);
                return;
            }
            return;
        }
        if (!n41Var.G(h.class) || (sVar = lVar.J) == null) {
            return;
        }
        try {
            sVar.run(l.a((MessageObject) n41Var.H));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
