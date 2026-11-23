package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
public final class a implements org.telegram.ui.ActionBar.q1, u10 {
    public final k f53324a;

    public a(k kVar) {
        this.f53324a = kVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k kVar = this.f53324a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f53454x.f35323g3.O(true);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = n41Var.H(d.class);
        k kVar = this.f53324a;
        if (H) {
            String charSequence = n41Var.f37655m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
            }
        } else if (n41Var.H(g.class) && (qVar = kVar.O) != null) {
            try {
                qVar.a(k.a((fj) n41Var.I));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
