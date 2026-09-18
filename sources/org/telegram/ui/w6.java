package org.telegram.ui;

import android.content.Context;
public final class w6 extends org.telegram.ui.Components.bd {
    public final y6 f38578e0;

    public w6(y6 y6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.bd.W, 0, org.telegram.ui.Components.bd.f22704a0);
        this.f38578e0 = y6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        a7 a7Var = this.f38578e0.e;
        if (!z10) {
            a7Var.f31738b.k1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < a7Var.f31743e0.size()) {
                v6 v6Var = (v6) a7Var.f31743e0.get(i12);
                if (v6Var != null && v6Var.f15543a == 11 && v6Var.f38305f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            a7Var.f31738b.f1(new i2.v(i11, 3), 0, true);
        } else {
            a7Var.f31738b.k1();
        }
    }
}
