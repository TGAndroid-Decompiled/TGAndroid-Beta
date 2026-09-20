package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class a implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final k f38816a;

    public a(k kVar) {
        this.f38816a = kVar;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k kVar = this.f38816a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f38963w.Y2.N(true);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.r rVar;
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean G = w51Var.G(d.class);
        k kVar = this.f38816a;
        if (G) {
            String charSequence = w51Var.f29948l.toString();
            org.telegram.ui.y yVar = kVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (w51Var.G(g.class) && (rVar = kVar.N) != null) {
            try {
                rVar.run(k.a((MessageObject) w51Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
