package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
public final class a implements org.telegram.ui.ActionBar.r1, v10 {
    public final k f53049a;

    public a(k kVar) {
        this.f53049a = kVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k kVar = this.f53049a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f53172x.f34607g3.O(true);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = l41Var.H(d.class);
        k kVar = this.f53049a;
        if (H) {
            String charSequence = l41Var.f37018m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
            }
        } else if (l41Var.H(g.class) && (qVar = kVar.O) != null) {
            try {
                qVar.a(k.a((fj) l41Var.I));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
