package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements uu0, org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.k1 {
    public final l4 f41550a;

    public t(l4 l4Var) {
        this.f41550a = l4Var;
    }

    @Override
    public boolean a(int i10, View view) {
        l4 l4Var = this.f41550a;
        l4Var.getClass();
        if (view instanceof k2) {
            e4 e4Var = ((k2) view).f38381n;
            l4Var.Z(e4Var.f36386a.articles.get(e4Var.f36387b).url);
            return true;
        }
        return false;
    }

    @Override
    public void b(float[] fArr) {
        l4 l4Var = this.f41550a;
        fArr[0] = l4Var.I0;
        fArr[1] = l4Var.f38779u0[0].f39633b.getMeasuredHeight();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        l4 l4Var = this.f41550a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = l4Var.H) != null && m1Var.isShowing()) {
            l4Var.H.d(true);
        }
    }
}
