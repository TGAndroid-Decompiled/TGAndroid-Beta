package org.telegram.ui;

import android.content.Context;
public final class x6 extends org.telegram.ui.Components.ed {
    public final y6 f42760e0;

    public x6(y6 y6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.ed.W, 0, org.telegram.ui.Components.ed.f26039a0);
        this.f42760e0 = y6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        a7 a7Var = this.f42760e0.f43075e;
        if (!z10) {
            a7Var.f34686b.m1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < a7Var.f34695g0.size()) {
                w6 w6Var = (w6) a7Var.f34695g0.get(i12);
                if (w6Var != null && w6Var.f17187a == 11 && w6Var.f41933f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            a7Var.f34686b.f1(new i2.w(i11, 7), 0, true);
        } else {
            a7Var.f34686b.m1();
        }
    }
}
