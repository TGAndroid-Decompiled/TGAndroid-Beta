package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class r implements os0, org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.i1 {
    public final h4 f40931a;

    public r(h4 h4Var) {
        this.f40931a = h4Var;
    }

    @Override
    public void a(float[] fArr) {
        h4 h4Var = this.f40931a;
        fArr[0] = h4Var.J0;
        fArr[1] = h4Var.f37691u0[0].f39061b.getMeasuredHeight();
    }

    @Override
    public boolean f(int i10, View view) {
        h4 h4Var = this.f40931a;
        h4Var.getClass();
        if (view instanceof h2) {
            b4 b4Var = ((h2) view).f37634n;
            h4Var.X(b4Var.f35934a.articles.get(b4Var.f35935b).url);
            return true;
        }
        return false;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        h4 h4Var = this.f40931a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = h4Var.H) != null && k1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
