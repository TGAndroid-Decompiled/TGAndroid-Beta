package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class v implements hv0, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.m1 {
    public final j4 f38393a;

    public v(j4 j4Var) {
        this.f38393a = j4Var;
    }

    @Override
    public void b(float[] fArr) {
        j4 j4Var = this.f38393a;
        fArr[0] = j4Var.I0;
        fArr[1] = j4Var.f34627u0[0].f35795b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        j4 j4Var = this.f38393a;
        j4Var.getClass();
        if (view instanceof j2) {
            d4 d4Var = ((j2) view).f34569n;
            j4Var.Z(d4Var.f32858a.articles.get(d4Var.f32859b).url);
            return true;
        }
        return false;
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        j4 j4Var = this.f38393a;
        j4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = j4Var.H) != null && o1Var.isShowing()) {
            j4Var.H.d(true);
        }
    }
}
