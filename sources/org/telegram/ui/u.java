package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class u implements hv0, org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.l1 {
    public final i4 f40999a;

    public u(i4 i4Var) {
        this.f40999a = i4Var;
    }

    @Override
    public void a(float[] fArr) {
        i4 i4Var = this.f40999a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.f37274u0[0].f38393b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        i4 i4Var = this.f40999a;
        i4Var.getClass();
        if (view instanceof i2) {
            c4 c4Var = ((i2) view).f37218n;
            i4Var.Z(c4Var.f35272a.articles.get(c4Var.f35273b).url);
            return true;
        }
        return false;
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.f40999a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
