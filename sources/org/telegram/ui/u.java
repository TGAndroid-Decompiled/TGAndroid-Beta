package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class u implements ev0, org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.k1 {
    public final i4 f38262a;

    public u(i4 i4Var) {
        this.f38262a = i4Var;
    }

    @Override
    public void b(float[] fArr) {
        i4 i4Var = this.f38262a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.f34408u0[0].f35461b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        i4 i4Var = this.f38262a;
        i4Var.getClass();
        if (view instanceof i2) {
            c4 c4Var = ((i2) view).f34350n;
            i4Var.Z(c4Var.f32556a.articles.get(c4Var.f32557b).url);
            return true;
        }
        return false;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        i4 i4Var = this.f38262a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = i4Var.H) != null && m1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
