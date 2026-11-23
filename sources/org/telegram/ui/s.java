package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements er0, org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.e1 {
    public final g4 f51799a;

    public s(g4 g4Var) {
        this.f51799a = g4Var;
    }

    @Override
    public void a(float[] fArr) {
        g4 g4Var = this.f51799a;
        fArr[0] = g4Var.K0;
        fArr[1] = g4Var.f47973v0[0].f49182b.getMeasuredHeight();
    }

    @Override
    public boolean c(int i7, View view) {
        g4 g4Var = this.f51799a;
        g4Var.getClass();
        if (view instanceof g2) {
            a4 a4Var = ((g2) view).f47918n;
            g4Var.X(a4Var.f45492a.articles.get(a4Var.f45493b).url);
            return true;
        }
        return false;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g4 g4Var = this.f51799a;
        g4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g4Var.I) != null && g1Var.isShowing()) {
            g4Var.I.d(true);
        }
    }
}
