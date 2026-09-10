package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class uw0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f37351a;
    public final vw0 f37352b;

    public uw0(vw0 vw0Var, int i10) {
        this.f37351a = i10;
        this.f37352b = vw0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37351a) {
            case 0:
                this.f37352b.Y();
                return;
            default:
                this.f37352b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        vw0 vw0Var = this.f37352b;
        vw0Var.getClass();
        if (((org.telegram.ui.Components.v51) obj).d == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z10 = !x8Var.e.h;
            vw0Var.f37640r = z10;
            x8Var.setChecked(z10);
            vw0Var.d.Y2.N(true);
            vw0Var.V(true);
        }
    }
}
