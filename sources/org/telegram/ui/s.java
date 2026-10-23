package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements vu0, org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.k1 {
    public final k4 f41272a;

    public s(k4 k4Var) {
        this.f41272a = k4Var;
    }

    @Override
    public void b(float[] fArr) {
        k4 k4Var = this.f41272a;
        fArr[0] = k4Var.J0;
        fArr[1] = k4Var.f38805u0[0].f39752b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        k4 k4Var = this.f41272a;
        k4Var.getClass();
        if (view instanceof j2) {
            d4 d4Var = ((j2) view).f38442n;
            k4Var.Z(d4Var.f36495a.articles.get(d4Var.f36496b).url);
            return true;
        }
        return false;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        k4 k4Var = this.f41272a;
        k4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
            k4Var.H.d(true);
        }
    }
}
