package org.telegram.ui.web;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a8;
import org.telegram.messenger.s10;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.r31;
public final class a implements org.telegram.ui.ActionBar.p1, s10 {
    public final l f50807a;

    public a(l lVar) {
        this.f50807a = lVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        l lVar = this.f50807a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f50934x.f35594g3.O(true);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.q qVar;
        r31 r31Var = (r31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        boolean H = r31Var.H(e.class);
        l lVar = this.f50807a;
        if (H) {
            String charSequence = r31Var.f37627l.toString();
            org.telegram.ui.z zVar = lVar.M;
            if (zVar != null) {
                zVar.a(charSequence);
            }
        } else if (r31Var.H(h.class) && (qVar = lVar.O) != null) {
            try {
                qVar.a(l.a((zi) r31Var.H));
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
