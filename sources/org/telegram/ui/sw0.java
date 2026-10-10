package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class sw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f41825a;
    public final tw0 f41826b;

    public sw0(tw0 tw0Var, int i10) {
        this.f41825a = i10;
        this.f41826b = tw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41825a) {
            case 0:
                this.f41826b.Y();
                return;
            default:
                this.f41826b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        tw0 tw0Var = this.f41826b;
        tw0Var.getClass();
        if (((org.telegram.ui.Components.q61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.f23692e.h;
            tw0Var.f42185r = z10;
            w8Var.setChecked(z10);
            tw0Var.d.W2.N(true);
            tw0Var.V(true);
        }
    }
}
