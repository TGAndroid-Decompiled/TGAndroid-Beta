package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class xv0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f40316a;
    public final yv0 f40317b;

    public xv0(yv0 yv0Var, int i10) {
        this.f40316a = i10;
        this.f40317b = yv0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f40316a) {
            case 0:
                this.f40317b.Y();
                return;
            default:
                this.f40317b.finishFragment();
                return;
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        yv0 yv0Var = this.f40317b;
        yv0Var.getClass();
        if (((org.telegram.ui.Components.i51) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z4 = !s8Var.e.h;
            yv0Var.f40589r = z4;
            s8Var.setChecked(z4);
            yv0Var.d.V2.N(true);
            yv0Var.V(true);
        }
    }
}
