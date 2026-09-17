package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class rw0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f40251a;
    public final tw0 f40252b;

    public rw0(tw0 tw0Var, int i10) {
        this.f40251a = i10;
        this.f40252b = tw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40251a) {
            case 0:
                this.f40252b.Y();
                return;
            default:
                this.f40252b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        tw0 tw0Var = this.f40252b;
        tw0Var.getClass();
        if (((org.telegram.ui.Components.h51) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.f23491e.h;
            tw0Var.f40849r = z10;
            w8Var.setChecked(z10);
            tw0Var.d.Y2.N(true);
            tw0Var.V(true);
        }
    }
}
