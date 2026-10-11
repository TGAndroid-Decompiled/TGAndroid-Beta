package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class rw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f41555a;
    public final sw0 f41556b;

    public rw0(sw0 sw0Var, int i10) {
        this.f41555a = i10;
        this.f41556b = sw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41555a) {
            case 0:
                this.f41556b.Y();
                return;
            default:
                this.f41556b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        sw0 sw0Var = this.f41556b;
        sw0Var.getClass();
        if (((org.telegram.ui.Components.q61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.f23716e.h;
            sw0Var.f41908r = z10;
            w8Var.setChecked(z10);
            sw0Var.d.W2.N(true);
            sw0Var.V(true);
        }
    }
}
