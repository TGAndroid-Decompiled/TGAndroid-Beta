package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements er0, org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.e1 {
    public final g4 f49607a;

    public s(g4 g4Var) {
        this.f49607a = g4Var;
    }

    @Override
    public void a(float[] fArr) {
        g4 g4Var = this.f49607a;
        fArr[0] = g4Var.J0;
        fArr[1] = g4Var.f45842u0[0].f47087b.getMeasuredHeight();
    }

    @Override
    public boolean c(int i7, View view) {
        g4 g4Var = this.f49607a;
        g4Var.getClass();
        if (view instanceof g2) {
            a4 a4Var = ((g2) view).f45785n;
            g4Var.X(a4Var.f43558a.articles.get(a4Var.f43559b).url);
            return true;
        }
        return false;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        g4 g4Var = this.f49607a;
        g4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = g4Var.H) != null && g1Var.isShowing()) {
            g4Var.H.d(true);
        }
    }
}
