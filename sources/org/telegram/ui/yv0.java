package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class yv0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f43518a;
    public final zv0 f43519b;

    public yv0(zv0 zv0Var, int i10) {
        this.f43518a = i10;
        this.f43519b = zv0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43518a) {
            case 0:
                this.f43519b.Y();
                return;
            default:
                this.f43519b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        zv0 zv0Var = this.f43519b;
        zv0Var.getClass();
        if (((org.telegram.ui.Components.f61) obj).d == 1) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            boolean z10 = !v8Var.e.h;
            zv0Var.f43839r = z10;
            v8Var.setChecked(z10);
            zv0Var.d.W2.N(true);
            zv0Var.V(true);
        }
    }
}
