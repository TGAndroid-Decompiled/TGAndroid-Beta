package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class zv0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f44005a;
    public final aw0 f44006b;

    public zv0(aw0 aw0Var, int i10) {
        this.f44005a = i10;
        this.f44006b = aw0Var;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f44005a) {
            case 0:
                this.f44006b.Y();
                return;
            default:
                this.f44006b.finishFragment();
                return;
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        aw0 aw0Var = this.f44006b;
        aw0Var.getClass();
        if (((org.telegram.ui.Components.j51) obj).d == 1) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z4 = !s8Var.f23753e.h;
            aw0Var.f35255r = z4;
            s8Var.setChecked(z4);
            aw0Var.d.V2.N(true);
            aw0Var.V(true);
        }
    }
}
