package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;
public final class a implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final l f45146a;

    public a(l lVar) {
        this.f45146a = lVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        l lVar = this.f45146a;
        lVar.getContext().getSharedPreferences("webhistory", 0).edit().remove("queries_json").apply();
        lVar.f45303w.f32150g3.O(true);
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        org.telegram.ui.q qVar;
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        boolean H = t61Var.H(e.class);
        l lVar = this.f45146a;
        if (H) {
            String charSequence = t61Var.f32872l.toString();
            org.telegram.ui.y yVar = lVar.L;
            if (yVar != null) {
                yVar.run(charSequence);
            }
        } else if (t61Var.H(h.class) && (qVar = lVar.N) != null) {
            try {
                qVar.run(l.a((MessageObject) t61Var.H));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
