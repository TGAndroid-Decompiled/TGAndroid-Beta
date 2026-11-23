package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
public final class a implements org.telegram.ui.ActionBar.q1, w10 {
    public final k f53059a;

    public a(k kVar) {
        this.f53059a = kVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k kVar = this.f53059a;
        kVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        kVar.f53183x.f35742g3.O(true);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = o41Var.H(d.class);
        k kVar = this.f53059a;
        if (H) {
            String charSequence = o41Var.f38058m.toString();
            org.telegram.ui.x xVar = kVar.M;
            if (xVar != null) {
                xVar.a(charSequence);
            }
        } else if (o41Var.H(g.class) && (qVar = kVar.O) != null) {
            try {
                qVar.a(k.a((gj) o41Var.I));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
