package org.telegram.ui;

import android.content.Context;
public final class t6 extends org.telegram.ui.Components.gd {
    public final v6 f42086e0;

    public t6(v6 v6Var, Context context) {
        super(context, 11, org.telegram.ui.Components.gd.W, 0, org.telegram.ui.Components.gd.f26675a0);
        this.f42086e0 = v6Var;
    }

    @Override
    public final void d(int i10, boolean z10) {
        x6 x6Var = this.f42086e0.f42879e;
        if (!z10) {
            x6Var.f43975b.j1();
            return;
        }
        int i11 = -1;
        if (i10 == 8) {
            i10 = -1;
        }
        int i12 = 0;
        while (true) {
            if (i12 < x6Var.f43974a0.size()) {
                s6 s6Var = (s6) x6Var.f43974a0.get(i12);
                if (s6Var != null && s6Var.f17175a == 11 && s6Var.f41594f == i10) {
                    i11 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        if (i11 >= 0) {
            x6Var.f43975b.e1(new i2.w(i11, 7), 0, true);
        } else {
            x6Var.f43975b.j1();
        }
    }
}
