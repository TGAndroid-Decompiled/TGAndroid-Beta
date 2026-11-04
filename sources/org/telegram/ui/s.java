package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class s implements uq0, org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.d1 {
    public final i4 f49313a;

    public s(i4 i4Var) {
        this.f49313a = i4Var;
    }

    @Override
    public void a(float[] fArr) {
        i4 i4Var = this.f49313a;
        fArr[0] = i4Var.K0;
        fArr[1] = i4Var.f46100v0[0].f47083b.getMeasuredHeight();
    }

    @Override
    public boolean f(int i3, View view) {
        i4 i4Var = this.f49313a;
        i4Var.getClass();
        if (view instanceof h2) {
            b4 b4Var = ((h2) view).f45784n;
            i4Var.X(b4Var.f43913a.articles.get(b4Var.f43914b).url);
            return true;
        }
        return false;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        i4 i4Var = this.f49313a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = i4Var.I) != null && f1Var.isShowing()) {
            i4Var.I.d(true);
        }
    }
}
