package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class v implements zu0, org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.n1 {
    public final n4 f38935a;

    public v(n4 n4Var) {
        this.f38935a = n4Var;
    }

    @Override
    public void c(float[] fArr) {
        n4 n4Var = this.f38935a;
        fArr[0] = n4Var.F0;
        fArr[1] = n4Var.f36375r0[0].f37684b.getMeasuredHeight();
    }

    @Override
    public boolean d(int i10, View view) {
        n4 n4Var = this.f38935a;
        n4Var.getClass();
        if (view instanceof m2) {
            h4 h4Var = ((m2) view).f35962n;
            n4Var.Z(h4Var.f34566a.articles.get(h4Var.f34567b).url);
            return true;
        }
        return false;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        n4 n4Var = this.f38935a;
        n4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = n4Var.E) != null && p1Var.isShowing()) {
            n4Var.E.d(true);
        }
    }
}
