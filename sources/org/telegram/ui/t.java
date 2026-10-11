package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements mv0, org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.k1 {
    public final h4 f42053a;

    public t(h4 h4Var) {
        this.f42053a = h4Var;
    }

    @Override
    public void b(float[] fArr) {
        h4 h4Var = this.f42053a;
        fArr[0] = h4Var.I0;
        fArr[1] = h4Var.f38319u0[0].f39530b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        h4 h4Var = this.f42053a;
        h4Var.getClass();
        if (view instanceof h2) {
            b4 b4Var = ((h2) view).f38261n;
            h4Var.Z(b4Var.f36287a.articles.get(b4Var.f36288b).url);
            return true;
        }
        return false;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        h4 h4Var = this.f42053a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = h4Var.H) != null && m1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
