package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

public final class u implements lu0, org.telegram.ui.Components.rk0, org.telegram.ui.ActionBar.l1 {

    public final m4 f43046a;

    public u(m4 m4Var) {
        this.f43046a = m4Var;
    }

    @Override
    public boolean a(int i10, View view) {
        m4 m4Var = this.f43046a;
        m4Var.getClass();
        if (!(view instanceof m2)) {
            return false;
        }
        g4 g4Var = ((m2) view).f40295n;
        m4Var.Z(g4Var.f38307a.articles.get(g4Var.f38308b).url);
        return true;
    }

    @Override
    public void h(float[] fArr) {
        m4 m4Var = this.f43046a;
        fArr[0] = m4Var.E0;
        fArr[1] = m4Var.f40347q0[0].f41496b.getMeasuredHeight();
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        m4 m4Var = this.f43046a;
        m4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = m4Var.D) != null && n1Var.isShowing()) {
            m4Var.D.d(true);
        }
    }
}
