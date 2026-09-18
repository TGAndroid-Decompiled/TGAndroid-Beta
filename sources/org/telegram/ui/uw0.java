package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class uw0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f38237a;
    public final vw0 f38238b;

    public uw0(vw0 vw0Var, int i10) {
        this.f38237a = i10;
        this.f38238b = vw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38237a) {
            case 0:
                this.f38238b.Y();
                return;
            default:
                this.f38238b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        vw0 vw0Var = this.f38238b;
        vw0Var.getClass();
        if (((org.telegram.ui.Components.j51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            vw0Var.f38522r = z10;
            w8Var.setChecked(z10);
            vw0Var.d.Y2.N(true);
            vw0Var.V(true);
        }
    }
}
