package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class v implements uu0, org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.n1 {
    public final l4 f42072a;

    public v(l4 l4Var) {
        this.f42072a = l4Var;
    }

    @Override
    public void c(float[] fArr) {
        l4 l4Var = this.f42072a;
        fArr[0] = l4Var.F0;
        fArr[1] = l4Var.f38619r0[0].f39904b.getMeasuredHeight();
    }

    @Override
    public boolean f(int i10, View view) {
        l4 l4Var = this.f42072a;
        l4Var.getClass();
        if (view instanceof k2) {
            f4 f4Var = ((k2) view).f38260n;
            l4Var.Z(f4Var.f36748a.articles.get(f4Var.f36749b).url);
            return true;
        }
        return false;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        l4 l4Var = this.f42072a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = l4Var.E) != null && p1Var.isShowing()) {
            l4Var.E.d(true);
        }
    }
}
