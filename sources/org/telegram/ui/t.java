package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements fv0, org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.l1 {
    public final i4 f37475a;

    public t(i4 i4Var) {
        this.f37475a = i4Var;
    }

    @Override
    public boolean d(int i10, View view) {
        i4 i4Var = this.f37475a;
        i4Var.getClass();
        if (view instanceof i2) {
            c4 c4Var = ((i2) view).f33964n;
            i4Var.Z(c4Var.f32251a.articles.get(c4Var.f32252b).url);
            return true;
        }
        return false;
    }

    @Override
    public void g(float[] fArr) {
        i4 i4Var = this.f37475a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.f34021u0[0].f35130b.getMeasuredHeight();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.f37475a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
