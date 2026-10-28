package org.telegram.ui;

import android.content.Context;
public final class z6 extends org.telegram.ui.Components.cd {
    public final a7 f46171e0;

    public z6(a7 a7Var, Context context) {
        super(context, 11, org.telegram.ui.Components.cd.W, 0, org.telegram.ui.Components.cd.f27125a0);
        this.f46171e0 = a7Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        c7 c7Var = this.f46171e0.e;
        if (!z10) {
            c7Var.f38190b.m1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < c7Var.f38198g0.size()) {
                y6 y6Var = (y6) c7Var.f38198g0.get(i12);
                if (y6Var != null && y6Var.f47075a == 11 && y6Var.f45857f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            c7Var.f38190b.e1(new i2.w(i11, 7), 0, true);
        } else {
            c7Var.f38190b.m1();
        }
    }
}
