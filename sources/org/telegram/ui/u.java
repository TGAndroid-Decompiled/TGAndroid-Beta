package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class u implements ov0, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1 {
    public final j4 f37065a;

    public u(j4 j4Var) {
        this.f37065a = j4Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j4 j4Var = this.f37065a;
        j4Var.getClass();
        if (view instanceof j2) {
            d4 d4Var = ((j2) view).f33858n;
            j4Var.Z(d4Var.f31822a.articles.get(d4Var.f31823b).url);
            return true;
        }
        return false;
    }

    @Override
    public void h(float[] fArr) {
        j4 j4Var = this.f37065a;
        fArr[0] = j4Var.I0;
        fArr[1] = j4Var.f33920u0[0].f35102b.getMeasuredHeight();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        j4 j4Var = this.f37065a;
        j4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = j4Var.H) != null && p1Var.isShowing()) {
            j4Var.H.d(true);
        }
    }
}
