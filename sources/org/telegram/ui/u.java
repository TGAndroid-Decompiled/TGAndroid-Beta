package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class u implements nv0, org.telegram.ui.Components.gm0, org.telegram.ui.ActionBar.l1 {
    public final i4 f42284a;

    public u(i4 i4Var) {
        this.f42284a = i4Var;
    }

    @Override
    public void b(float[] fArr) {
        i4 i4Var = this.f42284a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.f38513u0[0].f39750b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        i4 i4Var = this.f42284a;
        i4Var.getClass();
        if (view instanceof i2) {
            c4 c4Var = ((i2) view).f38455n;
            i4Var.Z(c4Var.f36507a.articles.get(c4Var.f36508b).url);
            return true;
        }
        return false;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.f42284a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
