package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class t implements lv0, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.l1 {
    public final i4 f40577a;

    public t(i4 i4Var) {
        this.f40577a = i4Var;
    }

    @Override
    public boolean a(int i10, View view) {
        i4 i4Var = this.f40577a;
        i4Var.getClass();
        if (view instanceof i2) {
            c4 c4Var = ((i2) view).f37167n;
            i4Var.Z(c4Var.f34990a.articles.get(c4Var.f34991b).url);
            return true;
        }
        return false;
    }

    @Override
    public void h(float[] fArr) {
        i4 i4Var = this.f40577a;
        fArr[0] = i4Var.I0;
        fArr[1] = i4Var.f37232u0[0].f38551b.getMeasuredHeight();
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        i4 i4Var = this.f40577a;
        i4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = i4Var.H) != null && n1Var.isShowing()) {
            i4Var.H.d(true);
        }
    }
}
