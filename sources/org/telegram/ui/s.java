package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements uu0, org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.k1 {
    public final k4 f41263a;

    public s(k4 k4Var) {
        this.f41263a = k4Var;
    }

    @Override
    public void b(float[] fArr) {
        k4 k4Var = this.f41263a;
        fArr[0] = k4Var.J0;
        fArr[1] = k4Var.f38774u0[0].f39702b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        k4 k4Var = this.f41263a;
        k4Var.getClass();
        if (view instanceof j2) {
            d4 d4Var = ((j2) view).f38437n;
            k4Var.Z(d4Var.f36463a.articles.get(d4Var.f36464b).url);
            return true;
        }
        return false;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        k4 k4Var = this.f41263a;
        k4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
            k4Var.H.d(true);
        }
    }
}
