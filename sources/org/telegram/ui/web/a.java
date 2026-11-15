package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
public final class a implements org.telegram.ui.ActionBar.q1, x10 {
    public final k f52564a;

    public a(k kVar) {
        this.f52564a = kVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k kVar = this.f52564a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f52689x.f39895g3.O(true);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        b41 b41Var = (b41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = b41Var.H(d.class);
        k kVar = this.f52564a;
        if (H) {
            String charSequence = b41Var.f33181l.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
            }
        } else if (b41Var.H(g.class) && (qVar = kVar.O) != null) {
            try {
                qVar.a(k.a((gj) b41Var.H));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
