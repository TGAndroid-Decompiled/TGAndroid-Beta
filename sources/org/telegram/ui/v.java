package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class v implements zu0, org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.n1 {
    public final l4 f41960a;

    public v(l4 l4Var) {
        this.f41960a = l4Var;
    }

    @Override
    public void c(float[] fArr) {
        l4 l4Var = this.f41960a;
        fArr[0] = l4Var.F0;
        fArr[1] = l4Var.f38524r0[0].f39862b.getMeasuredHeight();
    }

    @Override
    public boolean f(int i10, View view) {
        l4 l4Var = this.f41960a;
        l4Var.getClass();
        if (view instanceof k2) {
            f4 f4Var = ((k2) view).f38175n;
            l4Var.Z(f4Var.f36651a.articles.get(f4Var.f36652b).url);
            return true;
        }
        return false;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        l4 l4Var = this.f41960a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = l4Var.E) != null && p1Var.isShowing()) {
            l4Var.E.d(true);
        }
    }
}
