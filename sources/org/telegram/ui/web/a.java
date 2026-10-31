package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
public final class a implements org.telegram.ui.ActionBar.u1, o20 {
    public final j f42981a;

    public a(j jVar) {
        this.f42981a = jVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        j jVar = this.f42981a;
        jVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        jVar.f43072x.f30819f3.O(true);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.p pVar;
        a51 a51Var = (a51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        boolean H = a51Var.H(c.class);
        j jVar = this.f42981a;
        if (H) {
            String charSequence = a51Var.f24292l.toString();
            org.telegram.ui.w wVar = jVar.L;
            if (wVar != null) {
                wVar.a(charSequence);
            }
        } else if (a51Var.H(f.class) && (pVar = jVar.N) != null) {
            try {
                pVar.a(j.a((jj) a51Var.H));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
