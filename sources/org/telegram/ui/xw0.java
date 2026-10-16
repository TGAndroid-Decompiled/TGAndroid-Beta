package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class xw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f41672a;
    public final zw0 f41673b;

    public xw0(zw0 zw0Var, int i10) {
        this.f41672a = i10;
        this.f41673b = zw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41672a) {
            case 0:
                this.f41673b.Y();
                return;
            default:
                this.f41673b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        zw0 zw0Var = this.f41673b;
        zw0Var.getClass();
        if (((org.telegram.ui.Components.m61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            zw0Var.f42432r = z10;
            w8Var.setChecked(z10);
            zw0Var.d.W2.N(true);
            zw0Var.V(true);
        }
    }
}
