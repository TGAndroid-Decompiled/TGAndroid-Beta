package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class wv0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f42966a;
    public final xv0 f42967b;

    public wv0(xv0 xv0Var, int i10) {
        this.f42966a = i10;
        this.f42967b = xv0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42966a) {
            case 0:
                this.f42967b.Y();
                return;
            default:
                this.f42967b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        xv0 xv0Var = this.f42967b;
        xv0Var.getClass();
        if (((org.telegram.ui.Components.h61) obj).d == 1) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            boolean z10 = !v8Var.e.h;
            xv0Var.f43284r = z10;
            v8Var.setChecked(z10);
            xv0Var.d.W2.N(true);
            xv0Var.V(true);
        }
    }
}
