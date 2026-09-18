package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements ov0, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.m1 {
    public final h4 f37596a;

    public t(h4 h4Var) {
        this.f37596a = h4Var;
    }

    @Override
    public boolean d(int i10, View view) {
        h4 h4Var = this.f37596a;
        h4Var.getClass();
        if (view instanceof h2) {
            b4 b4Var = ((h2) view).f34108n;
            h4Var.Z(b4Var.f32048a.articles.get(b4Var.f32049b).url);
            return true;
        }
        return false;
    }

    @Override
    public void g(float[] fArr) {
        h4 h4Var = this.f37596a;
        fArr[0] = h4Var.I0;
        fArr[1] = h4Var.f34173u0[0].f35435b.getMeasuredHeight();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        h4 h4Var = this.f37596a;
        h4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = h4Var.H) != null && o1Var.isShowing()) {
            h4Var.H.d(true);
        }
    }
}
