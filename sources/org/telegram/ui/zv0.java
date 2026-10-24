package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class zv0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f44214a;
    public final aw0 f44215b;

    public zv0(aw0 aw0Var, int i10) {
        this.f44214a = i10;
        this.f44215b = aw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44214a) {
            case 0:
                this.f44215b.Y();
                return;
            default:
                this.f44215b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        aw0 aw0Var = this.f44215b;
        aw0Var.getClass();
        if (((org.telegram.ui.Components.l61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            aw0Var.f35858s = z10;
            w8Var.setChecked(z10);
            aw0Var.d.Z2.N(true);
            aw0Var.V(true);
        }
    }
}
