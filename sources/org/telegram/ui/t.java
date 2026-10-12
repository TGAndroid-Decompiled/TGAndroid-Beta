package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements tv0, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1 {
    public final k4 f40255a;

    public t(k4 k4Var) {
        this.f40255a = k4Var;
    }

    @Override
    public boolean a(int i10, View view) {
        k4 k4Var = this.f40255a;
        k4Var.getClass();
        if (view instanceof k2) {
            e4 e4Var = ((k2) view).f37493n;
            k4Var.Z(e4Var.f35460a.articles.get(e4Var.f35461b).url);
            return true;
        }
        return false;
    }

    @Override
    public void b(float[] fArr) {
        k4 k4Var = this.f40255a;
        fArr[0] = k4Var.I0;
        fArr[1] = k4Var.f37557u0[0].f38847b.getMeasuredHeight();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        k4 k4Var = this.f40255a;
        k4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
            k4Var.H.d(true);
        }
    }
}
