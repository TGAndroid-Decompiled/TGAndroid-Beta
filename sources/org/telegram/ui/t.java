package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements mv0, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.l1 {
    public final h4 f37575a;

    public t(h4 h4Var) {
        this.f37575a = h4Var;
    }

    @Override
    public void b(float[] fArr) {
        h4 h4Var = this.f37575a;
        fArr[0] = h4Var.I0;
        fArr[1] = h4Var.f34114u0[0].f35287b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        h4 h4Var = this.f37575a;
        h4Var.getClass();
        if (view instanceof h2) {
            b4 b4Var = ((h2) view).f34056n;
            h4Var.Z(b4Var.f32249a.articles.get(b4Var.f32250b).url);
            return true;
        }
        return false;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        h4 h4Var = this.f37575a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = h4Var.H) != null && n1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
