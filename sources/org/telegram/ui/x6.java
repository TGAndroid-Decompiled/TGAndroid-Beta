package org.telegram.ui;

import android.content.Context;
public final class x6 extends org.telegram.ui.Components.dd {
    public final z6 f39541e0;

    public x6(z6 z6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.dd.W, 0, org.telegram.ui.Components.dd.f23631a0);
        this.f39541e0 = z6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        b7 b7Var = this.f39541e0.e;
        if (!z10) {
            b7Var.f32257b.k1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < b7Var.f32262e0.size()) {
                w6 w6Var = (w6) b7Var.f32262e0.get(i12);
                if (w6Var != null && w6Var.f15754a == 11 && w6Var.f38821f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            b7Var.f32257b.f1(new i2.w(i11, 7), 0, true);
        } else {
            b7Var.f32257b.k1();
        }
    }
}
