package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.w31;
public final class a implements org.telegram.ui.ActionBar.r1, a20 {
    public final j f51078a;

    public a(j jVar) {
        this.f51078a = jVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        j jVar = this.f51078a;
        jVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        jVar.f51174x.f36781f3.O(true);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        w31 w31Var = (w31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = w31Var.H(c.class);
        j jVar = this.f51078a;
        if (H) {
            String charSequence = w31Var.f39830l.toString();
            org.telegram.ui.y yVar = jVar.L;
            if (yVar != null) {
                yVar.a(charSequence);
            }
        } else if (w31Var.H(f.class) && (qVar = jVar.N) != null) {
            try {
                qVar.a(j.a((ij) w31Var.H));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
