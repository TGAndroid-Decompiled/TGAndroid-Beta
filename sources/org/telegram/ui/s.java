package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements zu0, org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.m1 {
    public final j4 f43313a;

    public s(j4 j4Var) {
        this.f43313a = j4Var;
    }

    @Override
    public void a(float[] fArr) {
        j4 j4Var = this.f43313a;
        fArr[0] = j4Var.J0;
        fArr[1] = j4Var.f40446u0[0].f41440b.getMeasuredHeight();
    }

    @Override
    public boolean c(int i10, View view) {
        j4 j4Var = this.f43313a;
        j4Var.getClass();
        if (view instanceof h2) {
            c4 c4Var = ((h2) view).f39866n;
            j4Var.Z(c4Var.f38243a.articles.get(c4Var.f38244b).url);
            return true;
        }
        return false;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        j4 j4Var = this.f43313a;
        j4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = j4Var.H) != null && o1Var.isShowing()) {
            j4Var.H.d(true);
        }
    }
}
