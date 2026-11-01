package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.p20;
import org.telegram.ui.Components.b51;
public final class a implements org.telegram.ui.ActionBar.u1, p20 {
    public final j f42783a;

    public a(j jVar) {
        this.f42783a = jVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        j jVar = this.f42783a;
        jVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        jVar.f42874x.f31183f3.O(true);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.p pVar;
        b51 b51Var = (b51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        boolean H = b51Var.H(c.class);
        j jVar = this.f42783a;
        if (H) {
            String charSequence = b51Var.f24643l.toString();
            org.telegram.ui.w wVar = jVar.L;
            if (wVar != null) {
                wVar.a(charSequence);
            }
        } else if (b51Var.H(f.class) && (pVar = jVar.N) != null) {
            try {
                pVar.a(j.a((kj) b51Var.H));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
