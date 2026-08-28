package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements ku0, org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.m1 {
    public final l4 f42796a;

    public t(l4 l4Var) {
        this.f42796a = l4Var;
    }

    @Override
    public boolean a(int i9, View view) {
        l4 l4Var = this.f42796a;
        l4Var.getClass();
        if (view instanceof l2) {
            f4 f4Var = ((l2) view).f39975n;
            l4Var.Z(f4Var.f38130a.articles.get(f4Var.f38131b).url);
            return true;
        }
        return false;
    }

    @Override
    public void h(float[] fArr) {
        l4 l4Var = this.f42796a;
        fArr[0] = l4Var.E0;
        fArr[1] = l4Var.f40026q0[0].f41320b.getMeasuredHeight();
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        l4 l4Var = this.f42796a;
        l4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = l4Var.D) != null && o1Var.isShowing()) {
            l4Var.D.d(true);
        }
    }
}
