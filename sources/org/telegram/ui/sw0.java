package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class sw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f37560a;
    public final tw0 f37561b;

    public sw0(tw0 tw0Var, int i10) {
        this.f37560a = i10;
        this.f37561b = tw0Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37560a) {
            case 0:
                this.f37561b.Y();
                return;
            default:
                this.f37561b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        tw0 tw0Var = this.f37561b;
        tw0Var.getClass();
        if (((org.telegram.ui.Components.w51) obj).d == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z10 = !x8Var.e.h;
            tw0Var.f37895r = z10;
            x8Var.setChecked(z10);
            tw0Var.d.Y2.N(true);
            tw0Var.V(true);
        }
    }
}
