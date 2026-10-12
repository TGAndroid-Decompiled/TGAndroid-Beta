package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class yw0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f42290a;
    public final zw0 f42291b;

    public yw0(zw0 zw0Var, int i10) {
        this.f42290a = i10;
        this.f42291b = zw0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42290a) {
            case 0:
                this.f42291b.Y();
                return;
            default:
                this.f42291b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        zw0 zw0Var = this.f42291b;
        zw0Var.getClass();
        if (((org.telegram.ui.Components.l61) obj).d == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z10 = !w8Var.e.h;
            zw0Var.f42728r = z10;
            w8Var.setChecked(z10);
            zw0Var.d.W2.N(true);
            zw0Var.V(true);
        }
    }
}
